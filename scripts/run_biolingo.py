import sys, os, subprocess


# Obtener la ruta absoluta del proyecto (carpeta raíz tp1)
BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
def run_llvm_opt_demo():
    """
    Ejecuta la demo de optimizacion LLVM escrita en C++.
    Esto asume que el ejecutable ya fue compilado en:
    <raiz_proyecto>/llvm_opt_demo/build/BiolingoOptDemo

    En Windows se esperaria BiolingoOptDemo.exe
    """
    exe_name = "BiolingoOptDemo"
    if os.name == "nt":  # Windows
        exe_name += ".exe"

    exe_path = os.path.join(BASE_DIR, "llvm_opt_demo", "build", exe_name)

    if not os.path.exists(exe_path):
        print("\n[WARN] No se encontro el ejecutable de la demo LLVM.")
        print("       Compila primero con:")
        print("       cd llvm_opt_demo && mkdir -p build && cd build && cmake .. && make")
        return

    print("\n=== DEMO DE OPTIMIZACION LLVM (O2) ===\n")
    # check=False para que, si devuelve error, no reviente todo el script
    subprocess.run([exe_path], check=False)

sys.path.append(BASE_DIR)
from antlr4 import *
from source.biolingoLexer import biolingoLexer
from source.biolingoParser import biolingoParser
from source.executor import BiolingoExecutor

def main():
    input_stream = FileStream(os.path.join(BASE_DIR, "scripts", "grammar_test", "test1.txt"))
    lexer = biolingoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = biolingoParser(stream)
    tree = parser.program()

    print("=== TOKENS ===")
    stream.fill()
    for token in stream.tokens:
        print(token)

    print("\n=== EJECUCIÓN ===")
    executor = BiolingoExecutor()
    executor.visit(tree)
    run_llvm_opt_demo()

if __name__ == '__main__':
    main()
