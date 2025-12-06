from source.biolingoVisitor import biolingoVisitor
from source.ir_gc_backend import compute_gc_content_llvm, compute_length_llvm

class BiolingoExecutor(biolingoVisitor):
    """
    Visitor/Executor para el lenguaje Biolingo.
    - Mantiene un entorno de variables en self.variables
    - Implementa las funciones nativas: length, gc_content, complement, reverse, translate
    - Soporta operadores unarios ~, <- y ~<-
    - Evalua expresiones con alternativas etiquetadas en la gramatica
    """

    # ================================================================
    # Inicializacion
    # ================================================================
    def __init__(self):
        self.variables = {}

    # ================================================================
    # Visitors principales (programa y statements)
    # ================================================================
    def visitProgram(self, ctx):
        print("Iniciando ejecucion del programa Biolingo...\n")
        for stmt in ctx.stmt():
            self.visit(stmt)
        print("\nEjecucion finalizada.")

    def visitAssignment_stmt(self, ctx):
        """
        Asignacion: ID = expression ;
        """
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        print(f"Asignacion: {var_name} = {value}")
        return value

    def visitPrint_stmt(self, ctx):
        """
        PRINT expression ;
        """
        value = self.visit(ctx.expression())
        print(f"Resultado -> {value}")
        return value

    def visitTrain_markov_stmt(self, ctx):
        """
        TRAIN_MARKOV ON source ('WITH' markov_params)? ;
        Solo muestra trazas (no entrena realmente).
        """
        source = ctx.source().getText()
        if ctx.markov_params():
            print(f"Entrenando modelo de Markov con {source} y parametros: {ctx.markov_params().getText()}")
        else:
            print(f"Entrenando modelo de Markov con {source} (sin parametros)")
        return None

    def visitFind_genes_stmt(self, ctx):
        """
        FIND_GENES IN expression ('USING' markov_config)? ;
        Solo muestra trazas (no busca realmente).
        """
        target = ctx.expression().getText()
        if ctx.markov_config():
            print(f"Buscando genes en {target} usando configuracion {ctx.markov_config().getText()}")
        else:
            print(f"Buscando genes en {target} sin configuracion adicional")
        return None

    def visitQuery_stmt(self, ctx):
        """
        FIND sequences FROM source where_clause? select_clause? limit_clause? ;
        Solo muestra trazas (no ejecuta consulta real).
        """
        src = ctx.source().getText()
        print(f"Ejecutando busqueda de secuencias desde {src}")
        if ctx.where_clause():
            print(f"  WHERE: {ctx.where_clause().getText()}")
        if ctx.select_clause():
            print(f"  SELECT: {ctx.select_clause().getText()}")
        if ctx.limit_clause():
            print(f"  LIMIT: {ctx.limit_clause().getText()}")
        return None

    # ================================================================
    # Visitors de EXPRESION (alternativas etiquetadas en el .g4)
    # ================================================================
    def visitIdExpr(self, ctx):
        """
        ID -> devuelve el valor almacenado en variables.
        """
        name = ctx.ID().getText()
        if name in self.variables:
            return self.variables[name]
        else:
            print(f"[WARN] Variable '{name}' no definida, devolviendo nombre")
            return name

    def visitLiteralExpr(self, ctx):
        """
        literal -> NUMBER | STRING | BOOLEAN | percentage | sequence_literal
        """
        return self.visitLiteral(ctx.literal())

    def visitBioSeqExpr(self, ctx):
        """
        bio_seq -> ('DNA' | 'RNA' | 'PROTEIN') STRING
        Normaliza a formato canonico sin espacio: DNA"ATGC"
        """
        return self.visitBio_seq(ctx.bio_seq())

    def visitFuncCall(self, ctx):
        """
        function_call -> func_name '(' arg_list? ')'
        """
        return self.visitFunction_call(ctx.function_call())

    def visitGroup(self, ctx):
        """
        ( expression )
        """
        return self.visit(ctx.expression())

    def visitMulDivMod(self, ctx):
        """
        expression ('*' | '/' | '%') expression
        """
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)
        if isinstance(l, (int, float)) and isinstance(r, (int, float)):
            op = ctx.op.text
            if op == '*':
                return l * r
            if op == '/':
                return l / r
            if op == '%':
                return l % r
        return None

    def visitAddSub(self, ctx):
        """
        expression ('+' | '-') expression
        """
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)
        if isinstance(l, (int, float)) and isinstance(r, (int, float)):
            return l + r if ctx.op.text == '+' else l - r
        return None

    def visitFieldAccess(self, ctx):
        """
        expression '.' ID
        Por ahora no hace nada especial, solo evalua el objeto.
        """
        return self.visit(ctx.obj)

    # Unarios etiquetados
    def visitUnaryComplement(self, ctx):
        """
        ~ expression
        """
        value = self.visit(ctx.expression())
        kind = self._infer_kind(value, "DNA")
        seq = self._extract_seq(value)
        return self.fn_complement(seq, kind)

    def visitUnaryReverse(self, ctx):
        """
        <- expression
        """
        value = self.visit(ctx.expression())
        kind = self._infer_kind(value, "DNA")
        seq = self._extract_seq(value)
        return self.fn_reverse(seq, kind)

    def visitUnaryRevComplement(self, ctx):
        """
        ~<- expression
        """
        value = self.visit(ctx.expression())
        kind = self._infer_kind(value, "DNA")
        seq = self._extract_seq(value)
        comp = self.fn_complement(seq, kind)
        # comp ya tiene formato KIND"SEQ", extraemos de nuevo
        seq_comp = self._extract_seq(comp)
        return self.fn_reverse(seq_comp, kind)

    # ================================================================
    # Literales y secuencias
    # ================================================================
    def visitLiteral(self, ctx):
        """
        Devuelve valores nativos de Python cuando aplica.
        Las secuencias tipadas (DNA/RNA/PROTEIN) se devuelven como texto,
        y se procesan en _extract_seq cuando sea necesario.
        """
        if ctx.NUMBER():
            txt = ctx.NUMBER().getText()
            return float(txt) if '.' in txt else int(txt)

        if ctx.STRING():
            s = ctx.STRING().getText()
            return s[1:-1]

        if ctx.BOOLEAN():
            return ctx.BOOLEAN().getText().lower() == 'true'

        if ctx.sequence_literal():
            # p.ej. DNA_LITERAL token -> devolvemos el texto tal cual
            return ctx.sequence_literal().getText()

        return None

    def visitBio_seq(self, ctx):
        """
        Normaliza 'DNA "ATGC"' -> 'DNA"ATGC"' (sin espacio).
        """
        seq_type = ctx.getChild(0).getText()   # DNA | RNA | PROTEIN
        seq_value = ctx.STRING().getText()     # "ATGC"
        inner = seq_value[1:-1]
        return f'{seq_type}"{inner}"'

    # ================================================================
    # Llamadas a funciones del lenguaje
    # ================================================================
    def visitFunction_call(self, ctx):
        """
        Despacho real de funciones nativas segun nombre y argumento(s).
        """
        func_name = ctx.func_name().getText()
        # recolecta argumentos evaluados
        args = []
        if ctx.arg_list():
            args = [self.visit(e) for e in ctx.arg_list().expression()]
        
        # primer argumento esperado: secuencia o variable
        if not args:
            print(f"[WARN] Funcion '{func_name}' llamada sin argumentos")
            return None
            
        seq_raw = args[0]
        kind = self._infer_kind(seq_raw, "DNA")
        seq = self._extract_seq(seq_raw)

        name = func_name.lower()
        if name == "length":
            return self.fn_length(seq)
        if name == "gc_content":
            return self.fn_gc_content(seq, kind)
        if name == "complement":
            return self.fn_complement(seq, kind)
        if name == "reverse":
            return self.fn_reverse(seq, kind)
        if name == "translate":
            return self.fn_translate(seq, kind)

        # si no coincide con nativa, devuelve el nombre (compatibilidad simple)
        print(f"[WARN] Funcion '{func_name}' no reconocida")
        return func_name

    # ================================================================
    # Helpers internos (parseo de secuencias y tipo)
    # ================================================================
    def _extract_seq(self, v):
        """
        Extrae la cadena biologica limpia desde formatos como:
          - DNA"ATGC" / RNA"AUGC" / PROTEIN"MKT*"
          - "ATGC"
          - ATGC (sin comillas, si es necesario)
        """
        if v is None:
            return ""

        s = str(v).strip()
        
        # Casos tipados con prefijo y comillas: DNA"ATGC"
        for prefix in ("DNA", "RNA", "PROTEIN"):
            if s.upper().startswith(prefix):
                # Formato esperado: PREFIX"SEQUENCE"
                # Buscar primera y ultima comilla
                first_quote = s.find('"')
                last_quote = s.rfind('"')
                
                if first_quote != -1 and last_quote > first_quote:
                    extracted = s[first_quote + 1:last_quote]
                    return extracted
                else:
                    # Si no hay comillas, asumir que todo despues del prefijo es la secuencia
                    return s[len(prefix):].strip()
        
        # Si viene entre comillas sin prefijo: "ATGC" -> ATGC
        if s.startswith('"') and s.endswith('"') and len(s) > 1:
            return s[1:-1]
        
        # Caso sin formato especial, devolver tal cual
        return s

    def _infer_kind(self, v, default_kind="DNA"):
        """
        Infere el tipo de la secuencia (DNA / RNA / PROTEIN) por prefijo textual.
        Si no encuentra prefijo, devuelve default_kind.
        """
        if v is None:
            return default_kind
            
        s = str(v).strip().upper()
        if s.startswith("RNA"):
            return "RNA"
        if s.startswith("DNA"):
            return "DNA"
        if s.startswith("PROTEIN"):
            return "PROTEIN"
        return default_kind

    # ================================================================
    # Funciones nativas del lenguaje
    # ================================================================
    def fn_length(self, seq: str) -> int:
        """
        length(seq) -> longitud de la secuencia

        Implementacion hibrida:
        - Usamos LLVM (llvmlite) para calcular la longitud con IR + O2 + JIT.
        - Si algo falla en el backend LLVM, caemos a len(seq) en Python.
        """
        s = seq or ""
        py_len = len(s)
        
        try:
            llvm_len = compute_length_llvm(s)
            print(f"[LLVM] length({len(s)} bp) = {llvm_len}")
            return llvm_len
        except Exception as e:
            print(f"[WARN] Backend LLVM length fallo, usando Python. Detalle: {e}")
            return py_len

    def fn_gc_content(self, seq: str, kind: str) -> str:
        """
        gc_content(seq) -> porcentaje de G y C en DNA o RNA.
        Para PROTEIN no aplica (devuelve '0.0%').
        Devuelve un string con una decimal, ej. '60.0%'.

        Implementacion hibrida:
        - Si es PROTEIN o secuencia vacia, devolvemos '0.0%' directamente.
        - Si es DNA/RNA, intentamos calcular con LLVM (llvmlite).
        - Si algo falla en el backend LLVM, caemos al metodo Python original.
        """
        if kind == "PROTEIN":
            return "0.0%"
        if not seq:
            return "0.0%"

        # Implementacion original en Python (fallback)
        s = seq.upper()
        gc = sum(1 for c in s if c in ("G", "C"))
        pct_py = (gc / len(s)) * 100.0 if len(s) > 0 else 0.0

        # Intentamos usar el backend LLVM
        try:
            pct_llvm = compute_gc_content_llvm(seq)
            print(f"[LLVM] gc_content({len(seq)} bp) = {pct_llvm:.1f}%")
            return f"{pct_llvm:.1f}%"
        except Exception as e:
            print(f"[WARN] Backend LLVM gc_content fallo, usando Python. Detalle: {e}")
            return f"{pct_py:.1f}%"

    def fn_complement(self, seq: str, kind: str = "DNA") -> str:
        """
        complement(seq) -> bases complementarias (DNA o RNA).
        DNA: A<->T, C<->G
        RNA: A<->U, C<->G
        """
        k = (kind or "DNA").upper()
        s = seq.upper()
        
        if k == "RNA":
            table = str.maketrans("AUCG", "UAGC")
        else:
            table = str.maketrans("ATCG", "TAGC")
        
        result_seq = s.translate(table)
        return f'{k}"{result_seq}"'

    def fn_reverse(self, seq: str, kind: str = "DNA") -> str:
        """
        reverse(seq) -> secuencia invertida (DNA/RNA/PROTEIN).
        """
        k = (kind or "DNA").upper()
        reversed_seq = seq[::-1]
        return f'{k}"{reversed_seq}"'

    def fn_translate(self, seq: str, kind: str) -> str:
        """
        translate(seq) -> traduccion de DNA a PROTEIN con el codigo genetico estandar.
        Si llega RNA, se transforma U->T. Si llega PROTEIN, se devuelve tal cual.
        """
        if kind == "PROTEIN":
            return f'PROTEIN"{seq}"'
            
        s = seq.upper().replace("U", "T")  # por si viene RNA

        codon_table = {
            'ATA':'I','ATC':'I','ATT':'I','ATG':'M',
            'ACA':'T','ACC':'T','ACG':'T','ACT':'T',
            'AAC':'N','AAT':'N','AAA':'K','AAG':'K',
            'AGC':'S','AGT':'S','AGA':'R','AGG':'R',
            'CTA':'L','CTC':'L','CTG':'L','CTT':'L',
            'CCA':'P','CCC':'P','CCG':'P','CCT':'P',
            'CAC':'H','CAT':'H','CAA':'Q','CAG':'Q',
            'CGA':'R','CGC':'R','CGG':'R','CGT':'R',
            'GTA':'V','GTC':'V','GTG':'V','GTT':'V',
            'GCA':'A','GCC':'A','GCG':'A','GCT':'A',
            'GAC':'D','GAT':'D','GAA':'E','GAG':'E',
            'GGA':'G','GGC':'G','GGG':'G','GGT':'G',
            'TCA':'S','TCC':'S','TCG':'S','TCT':'S',
            'TTC':'F','TTT':'F','TTA':'L','TTG':'L',
            'TAC':'Y','TAT':'Y','TAA':'*','TAG':'*',
            'TGC':'C','TGT':'C','TGA':'*','TGG':'W',
        }

        prot = []
        # Traduce por tripletes completos, codon desconocido -> 'X'
        for i in range(0, len(s) - len(s) % 3, 3):
            prot.append(codon_table.get(s[i:i+3], 'X'))
        result_prot = "".join(prot)
        return f'PROTEIN"{result_prot}"'