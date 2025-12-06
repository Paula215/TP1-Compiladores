# Generated from biolingo.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .biolingoParser import biolingoParser
else:
    from biolingoParser import biolingoParser

# This class defines a complete generic visitor for a parse tree produced by biolingoParser.

class biolingoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by biolingoParser#program.
    def visitProgram(self, ctx:biolingoParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#stmt.
    def visitStmt(self, ctx:biolingoParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#import_stmt.
    def visitImport_stmt(self, ctx:biolingoParser.Import_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#assignment_stmt.
    def visitAssignment_stmt(self, ctx:biolingoParser.Assignment_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#print_stmt.
    def visitPrint_stmt(self, ctx:biolingoParser.Print_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#train_markov_stmt.
    def visitTrain_markov_stmt(self, ctx:biolingoParser.Train_markov_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#find_genes_stmt.
    def visitFind_genes_stmt(self, ctx:biolingoParser.Find_genes_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#markov_config.
    def visitMarkov_config(self, ctx:biolingoParser.Markov_configContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#markov_params.
    def visitMarkov_params(self, ctx:biolingoParser.Markov_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#markov_param.
    def visitMarkov_param(self, ctx:biolingoParser.Markov_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#query_stmt.
    def visitQuery_stmt(self, ctx:biolingoParser.Query_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#source.
    def visitSource(self, ctx:biolingoParser.SourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#where_clause.
    def visitWhere_clause(self, ctx:biolingoParser.Where_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#select_clause.
    def visitSelect_clause(self, ctx:biolingoParser.Select_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#select_list.
    def visitSelect_list(self, ctx:biolingoParser.Select_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#select_item.
    def visitSelect_item(self, ctx:biolingoParser.Select_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#limit_clause.
    def visitLimit_clause(self, ctx:biolingoParser.Limit_clauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#condition.
    def visitCondition(self, ctx:biolingoParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#comparison.
    def visitComparison(self, ctx:biolingoParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#comp_op.
    def visitComp_op(self, ctx:biolingoParser.Comp_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#UnaryReverse.
    def visitUnaryReverse(self, ctx:biolingoParser.UnaryReverseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#Group.
    def visitGroup(self, ctx:biolingoParser.GroupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#FuncCall.
    def visitFuncCall(self, ctx:biolingoParser.FuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#MulDivMod.
    def visitMulDivMod(self, ctx:biolingoParser.MulDivModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#IdExpr.
    def visitIdExpr(self, ctx:biolingoParser.IdExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#AddSub.
    def visitAddSub(self, ctx:biolingoParser.AddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#BioSeqExpr.
    def visitBioSeqExpr(self, ctx:biolingoParser.BioSeqExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#UnaryComplement.
    def visitUnaryComplement(self, ctx:biolingoParser.UnaryComplementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#LiteralExpr.
    def visitLiteralExpr(self, ctx:biolingoParser.LiteralExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#UnaryMinus.
    def visitUnaryMinus(self, ctx:biolingoParser.UnaryMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#UnaryRevComplement.
    def visitUnaryRevComplement(self, ctx:biolingoParser.UnaryRevComplementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#FieldAccess.
    def visitFieldAccess(self, ctx:biolingoParser.FieldAccessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#bio_seq.
    def visitBio_seq(self, ctx:biolingoParser.Bio_seqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#expr_list.
    def visitExpr_list(self, ctx:biolingoParser.Expr_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#function_call.
    def visitFunction_call(self, ctx:biolingoParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#arg_list.
    def visitArg_list(self, ctx:biolingoParser.Arg_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#func_name.
    def visitFunc_name(self, ctx:biolingoParser.Func_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#basic_func.
    def visitBasic_func(self, ctx:biolingoParser.Basic_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#agg_func.
    def visitAgg_func(self, ctx:biolingoParser.Agg_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#literal.
    def visitLiteral(self, ctx:biolingoParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#percentage.
    def visitPercentage(self, ctx:biolingoParser.PercentageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by biolingoParser#sequence_literal.
    def visitSequence_literal(self, ctx:biolingoParser.Sequence_literalContext):
        return self.visitChildren(ctx)



del biolingoParser