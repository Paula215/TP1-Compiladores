import sys, os

# Obtener la ruta absoluta del proyecto (carpeta raíz tp1)
BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
sys.path.append(BASE_DIR)
from antlr4 import *
from source.biolingoLexer import biolingoLexer
from source.biolingoParser import biolingoParser
from source.executor import BiolingoExecutor

def main():
    input_stream = FileStream(os.path.join(BASE_DIR, "test", "grammar_test", "test1.txt"))
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

if __name__ == '__main__':
    main()
