import sys, os
sys.path.append(os.path.dirname(__file__) + "/..")

from antlr4 import *
from source.biolingoLexer import biolingoLexer
from source.biolingoParser import biolingoParser

# Leer el archivo de entrada
input_stream = FileStream("test/grammar_test/test1.txt")

# Crear el lexer y parser
lexer = biolingoLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = biolingoParser(stream)

# Iniciar el análisis con la regla principal (por ejemplo 'program')
tree = parser.program()

# Imprimir los tokens
print("=== TOKENS ===")
lexer = biolingoLexer(FileStream("test/grammar_test/test1.txt"))
for token in lexer.getAllTokens():
    print(token)
