# source/executor.py
from source.biolingoVisitor import biolingoVisitor
from source.biolingoParser import biolingoParser

class BiolingoExecutor(biolingoVisitor):
    def __init__(self):
        self.variables = {}

    # Asignaciones: ID = expr;
    def visitAssignment_stmt(self, ctx):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        return value

    # PRINT expr;
    def visitPrint_stmt(self, ctx):
        value = self.visit(ctx.expression())
        print(value)
        return value

    # Literales (números, strings, etc.)
    def visitLiteral(self, ctx):
        if ctx.NUMBER():
            return float(ctx.NUMBER().getText())
        elif ctx.STRING():
            return ctx.STRING().getText().strip('"')
        else:
            return None

    # Secuencia biológica (DNA "...")
    def visitBio_seq(self, ctx):
        seq_type = ctx.getChild(0).getText()  # DNA / RNA / PROTEIN
        seq_value = ctx.STRING().getText().strip('"')
        return (seq_type, seq_value)

    # Función length()
    def visitFunction_call(self, ctx):
        func_name = ctx.func_name().getText()
        args = [self.visit(arg) for arg in ctx.arg_list().expression()] if ctx.arg_list() else []

        if func_name == "length":
            seq_type, seq_value = args[0]
            return len(seq_value)
        elif func_name == "gc_content":
            seq_type, seq_value = args[0]
            gc = seq_value.count('G') + seq_value.count('C')
            return round(gc / len(seq_value) * 100, 2)
        else:
            print(f"⚠️ Función no implementada: {func_name}")
            return None
