// Generated from grammar/biolingo.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link biolingoParser}.
 */
public interface biolingoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link biolingoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(biolingoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(biolingoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(biolingoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(biolingoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(biolingoParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(biolingoParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(biolingoParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(biolingoParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#sequence_literal}.
	 * @param ctx the parse tree
	 */
	void enterSequence_literal(biolingoParser.Sequence_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#sequence_literal}.
	 * @param ctx the parse tree
	 */
	void exitSequence_literal(biolingoParser.Sequence_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#query_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuery_stmt(biolingoParser.Query_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#query_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuery_stmt(biolingoParser.Query_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(biolingoParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(biolingoParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(biolingoParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(biolingoParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(biolingoParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(biolingoParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(biolingoParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(biolingoParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(biolingoParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(biolingoParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#select_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item(biolingoParser.Select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#select_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item(biolingoParser.Select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(biolingoParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(biolingoParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#pipeline_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_stmt(biolingoParser.Pipeline_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#pipeline_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_stmt(biolingoParser.Pipeline_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#pipeline_source}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_source(biolingoParser.Pipeline_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#pipeline_source}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_source(biolingoParser.Pipeline_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#pipeline_step}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_step(biolingoParser.Pipeline_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#pipeline_step}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_step(biolingoParser.Pipeline_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#pipeline_op}.
	 * @param ctx the parse tree
	 */
	void enterPipeline_op(biolingoParser.Pipeline_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#pipeline_op}.
	 * @param ctx the parse tree
	 */
	void exitPipeline_op(biolingoParser.Pipeline_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(biolingoParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(biolingoParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(biolingoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(biolingoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(biolingoParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(biolingoParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(biolingoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(biolingoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#seq_type}.
	 * @param ctx the parse tree
	 */
	void enterSeq_type(biolingoParser.Seq_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#seq_type}.
	 * @param ctx the parse tree
	 */
	void exitSeq_type(biolingoParser.Seq_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(biolingoParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(biolingoParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(biolingoParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(biolingoParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(biolingoParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(biolingoParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(biolingoParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(biolingoParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#bio_func}.
	 * @param ctx the parse tree
	 */
	void enterBio_func(biolingoParser.Bio_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#bio_func}.
	 * @param ctx the parse tree
	 */
	void exitBio_func(biolingoParser.Bio_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#agg_func}.
	 * @param ctx the parse tree
	 */
	void enterAgg_func(biolingoParser.Agg_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#agg_func}.
	 * @param ctx the parse tree
	 */
	void exitAgg_func(biolingoParser.Agg_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(biolingoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(biolingoParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#percentage}.
	 * @param ctx the parse tree
	 */
	void enterPercentage(biolingoParser.PercentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#percentage}.
	 * @param ctx the parse tree
	 */
	void exitPercentage(biolingoParser.PercentageContext ctx);
}