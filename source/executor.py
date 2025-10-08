from source.biolingoVisitor import biolingoVisitor

class BiolingoExecutor(biolingoVisitor):
    def __init__(self):
        self.variables = {}

    # PROGRAM
    def visitProgram(self, ctx):
        print("🚀 Iniciando ejecución del programa Biolingo...\n")
        for stmt in ctx.stmt():
            self.visit(stmt)
        print("\n✅ Ejecución finalizada.")

    # ASIGNACIÓN: ID = expression;
    def visitAssignment_stmt(self, ctx):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        print(f"🧬 Asignación: {var_name} = {value}")
        return value

    # PRINT expr;
    def visitPrint_stmt(self, ctx):
        value = self.visit(ctx.expression())
        print(f"🖨️ PRINT → {value}")
        return value

    # TRAIN_MARKOV ...
    def visitTrain_markov_stmt(self, ctx):
        source = ctx.source().getText()
        if ctx.markov_params():
            print(f"⚙️ Entrenando modelo de Markov con {source} y parámetros: {ctx.markov_params().getText()}")
        else:
            print(f"⚙️ Entrenando modelo de Markov con {source} (sin parámetros)")
        return None

    # ----------------------------------------------------------------------
    # FIND_GENES ...
    # ----------------------------------------------------------------------
    def visitFind_genes_stmt(self, ctx):
        target = ctx.expression().getText()
        if ctx.markov_config():
            print(f"🔍 Buscando genes en {target} usando configuración {ctx.markov_config().getText()}")
        else:
            print(f"🔍 Buscando genes en {target} sin configuración adicional")
        return None

    # FIND sequences FROM source ...
    def visitQuery_stmt(self, ctx):
        src = ctx.source().getText()
        print(f"🔬 Ejecutando búsqueda de secuencias desde {src}")
        if ctx.where_clause():
            print(f"   ➤ Condición WHERE: {ctx.where_clause().getText()}")
        if ctx.select_clause():
            print(f"   ➤ Selección: {ctx.select_clause().getText()}")
        if ctx.limit_clause():
            print(f"   ➤ Límite: {ctx.limit_clause().getText()}")
        return None

    # LITERALES Y EXPRESIONES
    def visitLiteral(self, ctx):
        if ctx.NUMBER():
            return ctx.NUMBER().getText()
        elif ctx.STRING():
            return ctx.STRING().getText()
        elif ctx.BOOLEAN():
            return ctx.BOOLEAN().getText()
        elif ctx.sequence_literal():
            return ctx.sequence_literal().getText()
        return None

    def visitBio_seq(self, ctx):
        seq_type = ctx.getChild(0).getText()
        seq_value = ctx.STRING().getText()
        return f"{seq_type} {seq_value}"

    def visitExpression(self, ctx):
        text = ctx.getText()
        return text

    # FUNCIONES
    def visitFunction_call(self, ctx):
        func_name = ctx.func_name().getText()
        print(f"🧫 Ejecutando función: {func_name}()")
        return func_name
