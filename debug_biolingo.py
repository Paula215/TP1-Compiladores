#!/usr/bin/env python3
"""
Script de diagnóstico para BioLingo.
Identifica problemas en el parsing y ejecución.
"""

from antlr4 import *
from source.biolingoLexer import biolingoLexer
from source.biolingoParser import biolingoParser
from source.biolingoVisitor import biolingoVisitor

class DebugVisitor(biolingoVisitor):
    """Visitor que imprime el árbol AST"""
    
    def __init__(self):
        self.indent = 0
    
    def _print(self, msg):
        print("  " * self.indent + msg)
    
    def visitChildren(self, ctx):
        """Override para imprimir todos los nodos"""
        rule_name = type(ctx).__name__.replace('Context', '')
        text = ctx.getText()[:50]  # Primeros 50 caracteres
        
        self._print(f"├─ {rule_name}: {text}")
        
        self.indent += 1
        result = super().visitChildren(ctx)
        self.indent -= 1
        
        return result

def debug_parse(code: str):
    """Parsea y muestra el árbol"""
    print("="*60)
    print("CÓDIGO:")
    print(code)
    print("="*60)
    
    # Lexer
    input_stream = InputStream(code)
    lexer = biolingoLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    
    print("\nTOKENS:")
    tokens.fill()
    for i, token in enumerate(tokens.tokens):
        if token.type != Token.EOF:
            token_name = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else str(token.type)
            print(f"  {i:3d}: {token_name:20s} -> '{token.text}'")
    
    # Parser
    tokens.reset()
    parser = biolingoParser(tokens)
    tree = parser.program()
    
    print("\n" + "="*60)
    print("ÁRBOL AST:")
    print("="*60)
    
    visitor = DebugVisitor()
    visitor.visit(tree)
    
    return tree

def test_simple_cases():
    """Prueba casos simples uno por uno"""
    test_cases = [
        ('seq = DNA"ATGC";', 'Asignación simple'),
        ('comp = ~seq;', 'Operador complement ~'),
        ('rev = <-seq;', 'Operador reverse <-'),
        ('len = length(seq);', 'Función length'),
    ]
    
    for code, description in test_cases:
        print(f"\n{'='*60}")
        print(f"TEST: {description}")
        print(f"{'='*60}")
        try:
            tree = debug_parse(code)
            
            # Inspeccionar expresiones
            for stmt in tree.stmt():
                if stmt.assignment_stmt():
                    expr = stmt.assignment_stmt().expression()
                    print(f"\nTipo de expresión: {type(expr).__name__}")
                    print(f"Número de hijos: {expr.getChildCount()}")
                    for i in range(expr.getChildCount()):
                        child = expr.getChild(i)
                        child_text = child.getText() if hasattr(child, 'getText') else str(child)
                        print(f"  Hijo {i}: {child_text}")
            
            print(f"✓ Parse exitoso")
        except Exception as e:
            print(f"✗ Error: {e}")
            import traceback
            traceback.print_exc()

def inspect_expression_node(code: str):
    """Inspección detallada de un nodo expression"""
    print(f"\n{'='*60}")
    print("INSPECCIÓN DETALLADA DE EXPRESIONES")
    print(f"{'='*60}")
    
    input_stream = InputStream(code)
    lexer = biolingoLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = biolingoParser(tokens)
    tree = parser.program()
    
    for stmt in tree.stmt():
        if stmt.assignment_stmt():
            var_name = stmt.assignment_stmt().ID().getText()
            expr = stmt.assignment_stmt().expression()
            
            print(f"\n{'─'*40}")
            print(f"Variable: {var_name}")
            print(f"Expresión completa: {expr.getText()}")
            print(f"Tipo contexto: {type(expr).__name__}")
            print(f"Número hijos: {expr.getChildCount()}")
            
            # Listar todos los atributos del contexto
            print("\nAtributos disponibles:")
            attrs = [a for a in dir(expr) if not a.startswith('_')]
            for attr in attrs[:20]:  # Primeros 20
                try:
                    value = getattr(expr, attr)
                    if callable(value):
                        # Intentar llamar sin argumentos
                        try:
                            result = value()
                            if result is not None:
                                print(f"  {attr}(): {result}")
                        except:
                            pass
                    else:
                        print(f"  {attr}: {value}")
                except:
                    pass
            
            # Inspeccionar cada hijo
            print("\nHijos detallados:")
            for i in range(expr.getChildCount()):
                child = expr.getChild(i)
                print(f"  [{i}] {type(child).__name__}: {child.getText() if hasattr(child, 'getText') else child}")

if __name__ == "__main__":
    import sys
    
    if len(sys.argv) > 1:
        # Modo: debug de archivo
        print("Modo: Debug de archivo\n")
        with open(sys.argv[1], 'r') as f:
            code = f.read()
        debug_parse(code)
        print("\n\nInspección detallada:")
        inspect_expression_node(code)
    else:
        # Modo: tests automáticos
        print("MODO: Tests Automáticos\n")
        
        # Test 1: Casos simples
        test_simple_cases()
        
        # Test 2: Inspección detallada
        test_code = """
seq = DNA"ATGC";
comp = ~seq;
rev = <-seq;
"""
        inspect_expression_node(test_code)
        
        # Test 3: Verificar métodos del visitor
        print(f"\n{'='*60}")
        print("MÉTODOS VISIT EN EL EXECUTOR")
        print(f"{'='*60}")
        try:
            from source.executor import BiolingoExecutor
            executor = BiolingoExecutor()
            visit_methods = sorted([m for m in dir(executor) if m.startswith('visit')])
            
            print("\nMétodos implementados:")
            for method in visit_methods:
                print(f"  - {method}")
        except Exception as e:
            print(f"Error importando executor: {e}")