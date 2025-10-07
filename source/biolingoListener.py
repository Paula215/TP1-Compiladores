# Generated from biolingo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .biolingoParser import biolingoParser
else:
    from biolingoParser import biolingoParser

# This class defines a complete listener for a parse tree produced by biolingoParser.
class biolingoListener(ParseTreeListener):

    # Enter a parse tree produced by biolingoParser#program.
    def enterProgram(self, ctx:biolingoParser.ProgramContext):
        pass

    # Exit a parse tree produced by biolingoParser#program.
    def exitProgram(self, ctx:biolingoParser.ProgramContext):
        pass


    # Enter a parse tree produced by biolingoParser#stmt.
    def enterStmt(self, ctx:biolingoParser.StmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#stmt.
    def exitStmt(self, ctx:biolingoParser.StmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#import_stmt.
    def enterImport_stmt(self, ctx:biolingoParser.Import_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#import_stmt.
    def exitImport_stmt(self, ctx:biolingoParser.Import_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#assignment_stmt.
    def enterAssignment_stmt(self, ctx:biolingoParser.Assignment_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#assignment_stmt.
    def exitAssignment_stmt(self, ctx:biolingoParser.Assignment_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#print_stmt.
    def enterPrint_stmt(self, ctx:biolingoParser.Print_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#print_stmt.
    def exitPrint_stmt(self, ctx:biolingoParser.Print_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#train_markov_stmt.
    def enterTrain_markov_stmt(self, ctx:biolingoParser.Train_markov_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#train_markov_stmt.
    def exitTrain_markov_stmt(self, ctx:biolingoParser.Train_markov_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#find_genes_stmt.
    def enterFind_genes_stmt(self, ctx:biolingoParser.Find_genes_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#find_genes_stmt.
    def exitFind_genes_stmt(self, ctx:biolingoParser.Find_genes_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#markov_config.
    def enterMarkov_config(self, ctx:biolingoParser.Markov_configContext):
        pass

    # Exit a parse tree produced by biolingoParser#markov_config.
    def exitMarkov_config(self, ctx:biolingoParser.Markov_configContext):
        pass


    # Enter a parse tree produced by biolingoParser#markov_params.
    def enterMarkov_params(self, ctx:biolingoParser.Markov_paramsContext):
        pass

    # Exit a parse tree produced by biolingoParser#markov_params.
    def exitMarkov_params(self, ctx:biolingoParser.Markov_paramsContext):
        pass


    # Enter a parse tree produced by biolingoParser#markov_param.
    def enterMarkov_param(self, ctx:biolingoParser.Markov_paramContext):
        pass

    # Exit a parse tree produced by biolingoParser#markov_param.
    def exitMarkov_param(self, ctx:biolingoParser.Markov_paramContext):
        pass


    # Enter a parse tree produced by biolingoParser#query_stmt.
    def enterQuery_stmt(self, ctx:biolingoParser.Query_stmtContext):
        pass

    # Exit a parse tree produced by biolingoParser#query_stmt.
    def exitQuery_stmt(self, ctx:biolingoParser.Query_stmtContext):
        pass


    # Enter a parse tree produced by biolingoParser#source.
    def enterSource(self, ctx:biolingoParser.SourceContext):
        pass

    # Exit a parse tree produced by biolingoParser#source.
    def exitSource(self, ctx:biolingoParser.SourceContext):
        pass


    # Enter a parse tree produced by biolingoParser#where_clause.
    def enterWhere_clause(self, ctx:biolingoParser.Where_clauseContext):
        pass

    # Exit a parse tree produced by biolingoParser#where_clause.
    def exitWhere_clause(self, ctx:biolingoParser.Where_clauseContext):
        pass


    # Enter a parse tree produced by biolingoParser#select_clause.
    def enterSelect_clause(self, ctx:biolingoParser.Select_clauseContext):
        pass

    # Exit a parse tree produced by biolingoParser#select_clause.
    def exitSelect_clause(self, ctx:biolingoParser.Select_clauseContext):
        pass


    # Enter a parse tree produced by biolingoParser#select_list.
    def enterSelect_list(self, ctx:biolingoParser.Select_listContext):
        pass

    # Exit a parse tree produced by biolingoParser#select_list.
    def exitSelect_list(self, ctx:biolingoParser.Select_listContext):
        pass


    # Enter a parse tree produced by biolingoParser#select_item.
    def enterSelect_item(self, ctx:biolingoParser.Select_itemContext):
        pass

    # Exit a parse tree produced by biolingoParser#select_item.
    def exitSelect_item(self, ctx:biolingoParser.Select_itemContext):
        pass


    # Enter a parse tree produced by biolingoParser#limit_clause.
    def enterLimit_clause(self, ctx:biolingoParser.Limit_clauseContext):
        pass

    # Exit a parse tree produced by biolingoParser#limit_clause.
    def exitLimit_clause(self, ctx:biolingoParser.Limit_clauseContext):
        pass


    # Enter a parse tree produced by biolingoParser#condition.
    def enterCondition(self, ctx:biolingoParser.ConditionContext):
        pass

    # Exit a parse tree produced by biolingoParser#condition.
    def exitCondition(self, ctx:biolingoParser.ConditionContext):
        pass


    # Enter a parse tree produced by biolingoParser#comparison.
    def enterComparison(self, ctx:biolingoParser.ComparisonContext):
        pass

    # Exit a parse tree produced by biolingoParser#comparison.
    def exitComparison(self, ctx:biolingoParser.ComparisonContext):
        pass


    # Enter a parse tree produced by biolingoParser#comp_op.
    def enterComp_op(self, ctx:biolingoParser.Comp_opContext):
        pass

    # Exit a parse tree produced by biolingoParser#comp_op.
    def exitComp_op(self, ctx:biolingoParser.Comp_opContext):
        pass


    # Enter a parse tree produced by biolingoParser#expression.
    def enterExpression(self, ctx:biolingoParser.ExpressionContext):
        pass

    # Exit a parse tree produced by biolingoParser#expression.
    def exitExpression(self, ctx:biolingoParser.ExpressionContext):
        pass


    # Enter a parse tree produced by biolingoParser#expr_list.
    def enterExpr_list(self, ctx:biolingoParser.Expr_listContext):
        pass

    # Exit a parse tree produced by biolingoParser#expr_list.
    def exitExpr_list(self, ctx:biolingoParser.Expr_listContext):
        pass


    # Enter a parse tree produced by biolingoParser#function_call.
    def enterFunction_call(self, ctx:biolingoParser.Function_callContext):
        pass

    # Exit a parse tree produced by biolingoParser#function_call.
    def exitFunction_call(self, ctx:biolingoParser.Function_callContext):
        pass


    # Enter a parse tree produced by biolingoParser#arg_list.
    def enterArg_list(self, ctx:biolingoParser.Arg_listContext):
        pass

    # Exit a parse tree produced by biolingoParser#arg_list.
    def exitArg_list(self, ctx:biolingoParser.Arg_listContext):
        pass


    # Enter a parse tree produced by biolingoParser#func_name.
    def enterFunc_name(self, ctx:biolingoParser.Func_nameContext):
        pass

    # Exit a parse tree produced by biolingoParser#func_name.
    def exitFunc_name(self, ctx:biolingoParser.Func_nameContext):
        pass


    # Enter a parse tree produced by biolingoParser#basic_func.
    def enterBasic_func(self, ctx:biolingoParser.Basic_funcContext):
        pass

    # Exit a parse tree produced by biolingoParser#basic_func.
    def exitBasic_func(self, ctx:biolingoParser.Basic_funcContext):
        pass


    # Enter a parse tree produced by biolingoParser#agg_func.
    def enterAgg_func(self, ctx:biolingoParser.Agg_funcContext):
        pass

    # Exit a parse tree produced by biolingoParser#agg_func.
    def exitAgg_func(self, ctx:biolingoParser.Agg_funcContext):
        pass


    # Enter a parse tree produced by biolingoParser#literal.
    def enterLiteral(self, ctx:biolingoParser.LiteralContext):
        pass

    # Exit a parse tree produced by biolingoParser#literal.
    def exitLiteral(self, ctx:biolingoParser.LiteralContext):
        pass


    # Enter a parse tree produced by biolingoParser#percentage.
    def enterPercentage(self, ctx:biolingoParser.PercentageContext):
        pass

    # Exit a parse tree produced by biolingoParser#percentage.
    def exitPercentage(self, ctx:biolingoParser.PercentageContext):
        pass


    # Enter a parse tree produced by biolingoParser#sequence_literal.
    def enterSequence_literal(self, ctx:biolingoParser.Sequence_literalContext):
        pass

    # Exit a parse tree produced by biolingoParser#sequence_literal.
    def exitSequence_literal(self, ctx:biolingoParser.Sequence_literalContext):
        pass



del biolingoParser