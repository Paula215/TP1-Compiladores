# source/ir_gc_backend.py
#
# Backend LLVM para operaciones numericas de BioLingo (gc_content, length).
# Usa llvmlite para:
#  - generar IR LLVM
#  - aplicar optimizacion O2 (usando la API moderna de llvmlite.binding)
#  - ejecutar con JIT (MCJIT)
#
# Nota: este codigo es portable. En Windows tambien funciona siempre que
# llvmlite este instalado y configurado.

from llvmlite import ir, binding as llvm
import ctypes
import shutil
import subprocess
import tempfile
import uuid
import os

# Inicialización del target (no llamar a llvm.initialize() — está deprecado)
llvm.initialize_native_target()
llvm.initialize_native_asmprinter()


def _create_execution_engine_for_module(llvm_mod: llvm.ModuleRef):
    """
    Crea un MCJIT engine nuevo para el módulo pasado y lo devuelve.
    NOTA: el engine se inicializa con el propio llvm_mod (pasado como argumento
    al crear el engine) para evitar tener que llamar a add_module() después.
    """
    # Asegurar un nombre único para evitar colisiones internas
    unique_name = f"{llvm_mod.name}_{uuid.uuid4().hex}"
    try:
        llvm_mod.name = unique_name
    except Exception:
        # si no se puede asignar el nombre, no es crítico
        pass

    target = llvm.Target.from_default_triple()
    target_machine = target.create_target_machine()

    # Crear engine pasando el módulo directamente (evita add_module doble)
    engine = llvm.create_mcjit_compiler(llvm_mod, target_machine)
    engine.finalize_object()
    engine.run_static_constructors()
    return engine

def _optimize_module_O2(llvm_mod: llvm.ModuleRef, opt_level: int = 2):
    """
    Intenta optimizar llvm_mod con varios métodos, en orden:
      1) API moderna: llvm.PassManagerBuilder + ModulePassManager
      2) API legacy: llvm.create_pass_manager_builder() (si existe)
      3) Herramienta externa `opt` (si está en PATH)
      4) Fallback: no optimizar (se deja el módulo tal cual)
    Esto evita fallos en entornos donde llvmlite no expone las mismas APIs.
    """
    # --- 1) Intentar API moderna: PassManagerBuilder (llvmlite.binding.PassManagerBuilder) ---
    try:
        if hasattr(llvm, "PassManagerBuilder") and hasattr(llvm, "ModulePassManager"):
            pmb = llvm.PassManagerBuilder()
            pmb.opt_level = opt_level
            # intentamos activar vectorizaciones si están disponibles
            try:
                pmb.loop_vectorize = True
                pmb.slp_vectorize = True
            except Exception:
                pass
            pm = llvm.ModulePassManager()
            pmb.populate(pm)
            pm.run(llvm_mod)
            return
    except Exception:
        # seguir al siguiente intento
        pass

    # --- 2) Intentar API legacy: create_pass_manager_builder() ---
    try:
        # algunas versiones antiguas exponen create_pass_manager_builder
        if hasattr(llvm, "create_pass_manager_builder"):
            pmb = llvm.create_pass_manager_builder()
            pmb.opt_level = opt_level
            pm = llvm.create_module_pass_manager()
            # populate suele ser pmb.populate(pm) pero si no, usar pm.add...
            try:
                pmb.populate(pm)
            except Exception:
                # si populate no existe en esta versión, intentar el flujo alternativo
                pass
            pm.run(llvm_mod)
            return
    except Exception:
        pass

    # --- 3) Intentar usar la herramienta externa `opt` (LLVM) ---
    opt_path = shutil.which("opt")
    if opt_path:
        try:
            # escribir IR a un archivo temporal
            with tempfile.NamedTemporaryFile(suffix=".ll", delete=False, mode="w") as in_f:
                in_f.write(str(llvm_mod))
                in_name = in_f.name
            out_fd, out_name = tempfile.mkstemp(suffix=".ll")
            try:
                cmd = [opt_path, "-S", f"-O{opt_level}", in_name, "-o", out_name]
                # ejecutar opt (no lanzar excepción si falla, capturamos output)
                p = subprocess.run(cmd, check=False, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
                if p.returncode == 0:
                    # cargar el IR optimizado y reemplazar llvm_mod (parse_assembly retorna ModuleRef)
                    with open(out_name, "r") as fo:
                        optimized_text = fo.read()
                    new_mod = llvm.parse_assembly(optimized_text)
                    new_mod.verify()
                    # copiar contenido al modulo original (mutar) o devolver como nuevo
                    # Aquí sustituimos el objeto llvm_mod en sitio: reasignamos (llvmlite ModuleRef es immutable desde Python)
                    # La forma práctica: devolver el nuevo módulo (llamar a llvm.parse_assembly fuera si necesitas)
                    # Pero como esta función no devuelve, aplicamos pm.run sobre new_mod y luego reassign via parse.
                    # Para mantener compatibilidad, manipulamos llvm_mod._ptr (no público) -> evitarlo.
                    # En vez de mutar, simplemente replace variable en el caller: escribir optimized IR de nuevo
                    # Aquí vamos a re-parse y verify, luego assign str back (caller usa parse_assembly sobre str(module) normalmente)
                    # Para compatibilidad con tu flujo actual, reparse y then mutate by returning new_mod is best if caller accepts it.
                    # Pero para compatibilidad mínima, vamos a overwrite llvm_mod with parsed assembly via llvm_mod_ref = new_mod
                    # (en muchas llamadas el modulo se usa luego parse_assembly de nuevo, por lo que esto es suficiente)
                    # Rebind name by copying attributes (práctico: we simply set llvm_mod._ptr = new_mod._ptr if exists)
                    try:
                        llvm_mod._ptr = new_mod._ptr  # pragma: no cover — hack de reemplazo si objeto lo permite
                    except Exception:
                        # si no es posible, no hacemos nada; el caller todavía puede usar optimized_text si lo usa.
                        pass
                    return
                else:
                    # opt falló; lo mostramos en debug y caemos al fallback
                    # no raise para seguir al fallback
                    pass
            finally:
                try:
                    os.remove(in_name)
                except Exception:
                    pass
                try:
                    os.close(out_fd)
                    os.remove(out_name)
                except Exception:
                    pass
        except Exception:
            pass

    # --- 4) Fallback: no optimizar, avisar ---
    # No lanzamos excepción: el caller debe usar el módulo tal cual.
    print("[WARN] _optimize_module_O2: no se pudo aplicar optimizaciones (no disponible PassManagerBuilder ni opt). Se usa módulo sin optimizar.")
    return

def compute_gc_content_llvm(seq: str) -> float:
    """
    Calcula gc_content(seq) en LLVM:
    - Genera un modulo IR con una funcion double gc_content().
    - La funcion recorre la secuencia global @seq y cuenta G/C.
    - Aplica optimizaciones O2.
    - Ejecuta la funcion con JIT y devuelve el porcentaje como float.
    """
    s = (seq or "").upper()
    n = len(s)
    if n == 0:
        return 0.0

    module = ir.Module(name="gc_module")
    module.triple = llvm.get_default_triple()

    i8 = ir.IntType(8)
    i32 = ir.IntType(32)
    f64 = ir.DoubleType()

    printf_ty = ir.FunctionType(ir.IntType(32), [ir.PointerType(i8)], var_arg=True)
    printf = ir.Function(module, printf_ty, name="printf")

    # Global con la secuencia como arreglo de bytes
    arr_type = ir.ArrayType(i8, n)
    gv = ir.GlobalVariable(module, arr_type, name="seq")
    gv.global_constant = True
    gv.linkage = "internal"
    gv.initializer = ir.Constant(
        arr_type,
        [ir.Constant(i8, ord(ch)) for ch in s]
    )

    # Funcion: double gc_content()
    func_type = ir.FunctionType(f64, [])
    func = ir.Function(module, func_type, name="gc_content")

    entry_bb = func.append_basic_block("entry")
    loop_bb = func.append_basic_block("loop")
    body_bb = func.append_basic_block("body")
    end_bb = func.append_basic_block("end")

    builder = ir.IRBuilder(entry_bb)

    # int count = 0; int i = 0;
    count_ptr = builder.alloca(i32, name="count")
    idx_ptr = builder.alloca(i32, name="i")
    builder.store(ir.Constant(i32, 0), count_ptr)
    builder.store(ir.Constant(i32, 0), idx_ptr)

    builder.branch(loop_bb)

    # while (i < n)
    builder.position_at_start(loop_bb)
    i_val = builder.load(idx_ptr, name="i_val")
    cond = builder.icmp_signed("<", i_val, ir.Constant(i32, n), name="cond")
    builder.cbranch(cond, body_bb, end_bb)

    # cuerpo: chequeo de GC y i++
    builder.position_at_start(body_bb)
    i_val_body = builder.load(idx_ptr, name="i_val_body")
    # Usamos i32 directo para GEP (evitamos sext/trunc que mezclen tipos)
    idx_for_gep = i_val_body

    # GEP: acceder a seq[idx] (array of i8)
    seq_ptr = builder.gep(gv, [ir.Constant(i32, 0), idx_for_gep], name="seq_ptr")
    ch = builder.load(seq_ptr, name="ch")

    isG = builder.icmp_unsigned("==", ch, ir.Constant(i8, ord("G")), name="isG")
    isC = builder.icmp_signed("==", ch, ir.Constant(i8, ord("C")), name="isC")
    isGC = builder.or_(isG, isC, name="isGC")

    count_val = builder.load(count_ptr, name="count_val")
    count_inc = builder.add(count_val, ir.Constant(i32, 1), name="count_inc")
    count_new = builder.select(isGC, count_inc, count_val, name="count_new")
    builder.store(count_new, count_ptr)

    i_next = builder.add(i_val_body, ir.Constant(i32, 1), name="i_next")
    builder.store(i_next, idx_ptr)
    builder.branch(loop_bb)

    # end: porcentaje = (count / n) * 100.0
    builder.position_at_start(end_bb)
    final_count = builder.load(count_ptr, name="final_count")

    count_f64 = builder.sitofp(final_count, f64, name="count_f64")
    len_f64 = ir.Constant(f64, float(n))
    ratio = builder.fdiv(count_f64, len_f64, name="ratio")
    pct = builder.fmul(ratio, ir.Constant(f64, 100.0), name="pct")

    builder.ret(pct)

    # IR → LLVM modulo + optimizacion O2
    llvm_ir = str(module)
    llvm_mod = llvm.parse_assembly(llvm_ir)
    llvm_mod.verify()

    # Optimizar con API moderna
    _optimize_module_O2(llvm_mod, opt_level=2)

    # JIT: crear engine por módulo, ejecutar y remover módulo
    engine = _create_execution_engine_for_module(llvm_mod)
    try:
        # 1. FIX: Buscar el nombre correcto de la función
        func_ptr = engine.get_function_address("gc_content")  
        if func_ptr == 0:
            raise RuntimeError("No se obtuvo la dirección de la función.")
        
        # 2. FIX: Usar el tipo de retorno correcto (ctypes.c_double para f64)
        cfunc = ctypes.CFUNCTYPE(ctypes.c_double)(func_ptr)  
        result = cfunc()
        
        # 3. FIX: Retornar como float
        return float(result)
    finally:
        # remover módulo (seguro aún si engine fue creado con el módulo)
        try:
            engine.remove_module(llvm_mod)
        except Exception:
            pass
        # permitir GC del engine
        try:
            del engine
        except Exception:
            pass


def compute_length_llvm(seq: str) -> int:
    """
    Calcula length(seq) en LLVM:
    - Genera un modulo con una funcion int seq_length().
    - La funcion recorre un contador desde 0 hasta N-1 y retorna el valor final.
    - Aplica O2 y ejecuta con JIT.
    """
    s = seq or ""
    n = len(s)

    module = ir.Module(name="len_module")
    module.triple = llvm.get_default_triple()

    i32 = ir.IntType(32)

    func_type = ir.FunctionType(i32, [])
    func = ir.Function(module, func_type, name="seq_length")

    entry_bb = func.append_basic_block("entry")
    cond_bb = func.append_basic_block("cond")
    body_bb = func.append_basic_block("body")
    end_bb = func.append_basic_block("end")

    builder = ir.IRBuilder(entry_bb)

    # int i = 0;
    idx_ptr = builder.alloca(i32, name="i")
    builder.store(ir.Constant(i32, 0), idx_ptr)
    builder.branch(cond_bb)

    # while (i < n)
    builder.position_at_start(cond_bb)
    i_val = builder.load(idx_ptr, name="i_val")
    cond = builder.icmp_signed("<", i_val, ir.Constant(i32, n), name="cond")
    builder.cbranch(cond, body_bb, end_bb)

    # cuerpo: i++
    builder.position_at_start(body_bb)
    i_body = builder.load(idx_ptr, name="i_body")
    i_next = builder.add(i_body, ir.Constant(i32, 1), name="i_next")
    builder.store(i_next, idx_ptr)
    builder.branch(cond_bb)

    # end: return i;
    builder.position_at_start(end_bb)
    final_i = builder.load(idx_ptr, name="final_i")
    builder.ret(final_i)

    llvm_ir = str(module)
    llvm_mod = llvm.parse_assembly(llvm_ir)
    llvm_mod.verify()

    _optimize_module_O2(llvm_mod, opt_level=2)

    engine = _create_execution_engine_for_module(llvm_mod)
    try:
        func_ptr = engine.get_function_address("seq_length")  
        if func_ptr == 0:
            raise RuntimeError("No se obtuvo la dirección de la función.")
        cfunc = ctypes.CFUNCTYPE(ctypes.c_int32)(func_ptr)  
        result = cfunc()
        return int(result)
    finally:
        try:
            engine.remove_module(llvm_mod)
        except Exception:
            pass
        # permitir GC del engine
        try:
            del engine
        except Exception:
            pass
