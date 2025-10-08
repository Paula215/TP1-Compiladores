// Generated from /home/pauz/Documents/Compi/tp1/biolingo.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link biolingoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(biolingoParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(biolingoParser.StmtContext ctx);
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
	 * Enter a parse tree produced by {@link biolingoParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(biolingoParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(biolingoParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#train_markov_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTrain_markov_stmt(biolingoParser.Train_markov_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#train_markov_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTrain_markov_stmt(biolingoParser.Train_markov_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#find_genes_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFind_genes_stmt(biolingoParser.Find_genes_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#find_genes_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFind_genes_stmt(biolingoParser.Find_genes_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#markov_config}.
	 * @param ctx the parse tree
	 */
	void enterMarkov_config(biolingoParser.Markov_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#markov_config}.
	 * @param ctx the parse tree
	 */
	void exitMarkov_config(biolingoParser.Markov_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#markov_params}.
	 * @param ctx the parse tree
	 */
	void enterMarkov_params(biolingoParser.Markov_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#markov_params}.
	 * @param ctx the parse tree
	 */
	void exitMarkov_params(biolingoParser.Markov_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link biolingoParser#markov_param}.
	 * @param ctx the parse tree
	 */
	void enterMarkov_param(biolingoParser.Markov_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#markov_param}.
	 * @param ctx the parse tree
	 */
	void exitMarkov_param(biolingoParser.Markov_paramContext ctx);
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
	 * Enter a parse tree produced by {@link biolingoParser#basic_func}.
	 * @param ctx the parse tree
	 */
	void enterBasic_func(biolingoParser.Basic_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link biolingoParser#basic_func}.
	 * @param ctx the parse tree
	 */
	void exitBasic_func(biolingoParser.Basic_funcContext ctx);
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
}