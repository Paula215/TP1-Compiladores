from source.biolingoVisitor import biolingoVisitor
import re
import numpy as np
from collections import defaultdict

class MarkovModel:
    def __init__(self, order=3):
        self.order = order
        self.transition_matrix = defaultdict(lambda: defaultdict(float))
        self.initial_probs = defaultdict(float)
        self.states = set()
        self.alphabet = ['A', 'T', 'C', 'G']
        
    def train(self, sequences, annotations):
        """Entrena el modelo de Markov con secuencias anotadas"""
        print(f"🔬 Entrenando modelo de Markov de orden {self.order}")
        
        for seq, genes in zip(sequences, annotations):
            seq = seq.upper()
            
            # Crear máscara de genes (1=gen, 0=no gen)
            gene_mask = [0] * len(seq)
            for start, end in genes:
                for i in range(start, min(end, len(seq))):
                    if i < len(gene_mask):
                        gene_mask[i] = 1
            
            self._count_transitions(seq, gene_mask, target_state=1)
            self._count_transitions(seq, gene_mask, target_state=0)
        
        self._normalize_matrices()
        print(f"✅ Modelo entrenado con {len(self.states)} estados")
        
    def _count_transitions(self, sequence, gene_mask, target_state):
        for i in range(len(sequence) - self.order):
            if gene_mask[i] != target_state:
                continue
                
            current_state = sequence[i:i + self.order]
            next_char = sequence[i + self.order] if i + self.order < len(sequence) else 'END'
            
            self.states.add(current_state)
            self.transition_matrix[current_state][next_char] += 1
            
            if i == 0:
                self.initial_probs[current_state] += 1
    
    def _normalize_matrices(self):
        for state in self.transition_matrix:
            total = sum(self.transition_matrix[state].values())
            if total > 0:
                for next_char in self.transition_matrix[state]:
                    self.transition_matrix[state][next_char] /= total
        
        total_initial = sum(self.initial_probs.values())
        if total_initial > 0:
            for state in self.initial_probs:
                self.initial_probs[state] /= total_initial

    def predict_genes_viterbi(self, sequence, threshold=0.7):
        """Predice genes usando el algoritmo de Viterbi"""
        sequence = sequence.upper()
        n = len(sequence)
        
        if n < self.order:
            return []
        
        # Implementación simplificada para demo
        genes_found = []
        i = 0
        while i < len(sequence) - 6:
            if sequence[i:i+3] in ['ATG', 'GTG', 'TTG']:  # Codón inicio
                start = i
                # Buscar codón de parada
                for j in range(i+3, len(sequence)-2, 3):
                    if sequence[j:j+3] in ['TAA', 'TAG', 'TGA']:
                        end = j + 3
                        if end - start >= 100:  # Longitud mínima
                            genes_found.append((start, end))
                        i = end
                        break
                else:
                    i += 1
            else:
                i += 1
        
        return genes_found

class BiolingoExecutor(biolingoVisitor):
    def __init__(self):
        self.variables = {}
        self.markov_models = {}
        
        # Datos de entrenamiento
        self.training_data = {
            "genomic_data": {
                "sequences": [
                    "ATGCCGATACGTTACGATGCGATAGCTAGCTAGCTACGATCGATCGATCGATCGATCGTAGCTAGCTACGTAGC",
                    "ATGTTTACGTAGCTAGCTAGCTAGCTAGCTACGATCGATCGATCGATCGATCGTAGCTTGACGTAGCTACGTAC",
                ],
                "annotations": [
                    [(0, 20), (25, 45), (50, 70)],
                    [(0, 25), (30, 55)],  
                ]
            }
        }

    # MÉTODOS ESENCIALES QUE FALTABAN
    def visitSource(self, ctx):
        if ctx.STRING():
            return ctx.STRING().getText().strip('"')
        elif ctx.ID():
            var_name = ctx.ID().getText()
            return self.variables.get(var_name, var_name)
        return ctx.getText()

    def visitMarkov_params(self, ctx):
        params = {}
        if ctx.markov_param():
            for param in ctx.markov_param():
                key = param.getChild(0).getText()
                if param.NUMBER():
                    value = float(param.NUMBER().getText())
                    params[key] = value
                elif param.STRING():
                    value = param.STRING().getText().strip('"')
                    params[key] = value
        return params

    def visitMarkov_config(self, ctx):
        if ctx.markov_params():
            return self.visit(ctx.markov_params())
        return {}

    def visitWhere_clause(self, ctx):
        return self.visit(ctx.condition())

    def visitSelect_clause(self, ctx):
        return self.visit(ctx.select_list())

    def visitLimit_clause(self, ctx):
        return int(ctx.NUMBER().getText())

    def visitCondition(self, ctx):
        # Implementación básica de condiciones
        if ctx.comparison():
            return self.visit(ctx.comparison())
        elif ctx.getChildCount() == 3 and ctx.getChild(0).getText() == '(':
            return self.visit(ctx.condition(0))
        elif ctx.getChildCount() == 2 and ctx.getChild(0).getText() == 'NOT':
            return not self.visit(ctx.condition(0))
        elif ctx.getChildCount() == 3:
            left = self.visit(ctx.condition(0))
            op = ctx.getChild(1).getText()
            right = self.visit(ctx.condition(1))
            if op == 'AND':
                return left and right
            elif op == 'OR':
                return left or right
        return True

    def visitComparison(self, ctx):
        left = self.visit(ctx.expression(0))
        if ctx.comp_op():
            right = self.visit(ctx.expression(1))
            op = ctx.comp_op().getText()
            # Implementar operaciones de comparación
            return True  # Simplificado para demo
        return True

    # MÉTODOS PRINCIPALES (que ya tenías)
    def visitProgram(self, ctx):
        print("🚀 Iniciando ejecución del programa Biolingo...\n")
        for stmt in ctx.stmt():
            self.visit(stmt)
        print("\n✅ Ejecución finalizada.")

    def visitAssignment_stmt(self, ctx):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        print(f"🧬 Asignación: {var_name} = {value}")
        return value

    def visitPrint_stmt(self, ctx):
        value = self.visit(ctx.expression())
        print(f"🖨️ PRINT → {value}")
        return value

    def visitTrain_markov_stmt(self, ctx):
        source = self.visit(ctx.source())
        params = {}
        if ctx.markov_params():
            params = self.visit(ctx.markov_params())
        
        print(f"⚙️ Entrenando modelo de Markov con: {source}")
        print(f"   Parámetros: {params}")
        
        model_name = params.get('model', 'default_model')
        order = int(params.get('order', 3))
        
        model = MarkovModel(order=order)
        
        if source in self.training_data:
            data = self.training_data[source]
            model.train(data["sequences"], data["annotations"])
        else:
            print(f"⚠️  Fuente '{source}' no encontrada")
        
        self.markov_models[model_name] = {'model': model, 'params': params}
        print(f"✅ Modelo '{model_name}' entrenado")
        
        return model_name

    def visitFind_genes_stmt(self, ctx):
        target = self.visit(ctx.expression())
        config = {}
        if ctx.markov_config():
            config = self.visit(ctx.markov_config())
        
        print(f"🔍 Buscando genes en: {target[:50]}...")
        
        model_name = config.get('model', 'default_model')
        if model_name in self.markov_models:
            model = self.markov_models[model_name]['model']
            genes_found = model.predict_genes_viterbi(target)
            
            print(f"🎯 Genes encontrados: {len(genes_found)}")
            for i, (start, end) in enumerate(genes_found):
                print(f"   Gen {i+1}: {start}-{end} (longitud: {end-start})")
            
            return genes_found
        else:
            print(f"❌ Modelo '{model_name}' no encontrado")
            return []

    def visitExpression(self, ctx):
        if ctx.getChildCount() == 1:
            # Literal, ID, o función
            child = ctx.getChild(0)
            if hasattr(child, 'symbol'):
                if child.symbol.type == self.parser.ID:
                    var_name = child.getText()
                    return self.variables.get(var_name, var_name)
            return self.visit(child)
        
        elif ctx.getChildCount() == 2:
            # Operador unario: -, ~, <-, ~<-
            op = ctx.getChild(0).getText()
            expr = self.visit(ctx.getChild(1))
            if op == '-':
                return -expr if isinstance(expr, (int, float)) else expr
            elif op == '~':
                return f"complement({expr})"
            elif op == '<-':
                return f"reverse({expr})"
            elif op == '~<-':
                return f"reverse_complement({expr})"
        
        elif ctx.getChildCount() == 3:
            left = self.visit(ctx.getChild(0))
            middle = ctx.getChild(1).getText()
            right = self.visit(ctx.getChild(2))
            
            if middle in ['+', '-', '*', '/']:
                # Operación aritmética
                if middle == '+': return left + right
                elif middle == '-': return left - right
                elif middle == '*': return left * right
                elif middle == '/': return left / right if right != 0 else 0
            elif middle == '.':
                # Acceso a campo
                return f"{left}.{right}"
        
        return ctx.getText()

    def visitLiteral(self, ctx):
        if ctx.NUMBER():
            num_text = ctx.NUMBER().getText()
            return float(num_text) if '.' in num_text else int(num_text)
        elif ctx.STRING():
            return ctx.STRING().getText().strip('"')
        elif ctx.BOOLEAN():
            return ctx.BOOLEAN().getText().lower() == 'true'
        elif ctx.sequence_literal():
            return ctx.sequence_literal().getText()
        return None

    def visitBio_seq(self, ctx):
        seq_type = ctx.getChild(0).getText()
        seq_value = ctx.STRING().getText().strip('"')
        return f"{seq_type} {seq_value}"

    def visitFunction_call(self, ctx):
        func_name = ctx.func_name().getText()
        args = []
        if ctx.arg_list():
            args = [self.visit(arg) for arg in ctx.arg_list().expression()]
        
        print(f"🧫 Ejecutando función: {func_name}({args})")
        
        if func_name == 'length' and args:
            return len(str(args[0]))
        elif func_name == 'gc_content' and args:
            seq = str(args[0]).upper()
            gc_count = seq.count('G') + seq.count('C')
            return (gc_count / len(seq)) * 100 if seq else 0
        
        return f"{func_name}({', '.join(map(str, args))})"

    # Métodos para evitar errores de métodos no implementados
    def visitImport_stmt(self, ctx):
        print(f"📥 Importando: {ctx.STRING().getText()}")
        return None

    def visitQuery_stmt(self, ctx):
        source = self.visit(ctx.source())
        print(f"🔍 Buscando secuencias en: {source}")
        return []

    def visitEveryRule(self, ctx):
        """Maneja cualquier regla no implementada específicamente"""
        return None