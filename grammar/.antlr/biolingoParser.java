// Generated from /home/pauz/Documents/Compi/tp1/grammar/biolingo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class biolingoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, DNA_SEQ=56, RNA_SEQ=57, PROTEIN_SEQ=58, 
		BOOLEAN=59, NUMBER=60, STRING=61, ID=62, LINE_COMMENT=63, BLOCK_COMMENT=64, 
		WS=65;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_import_stmt = 2, RULE_assignment_stmt = 3, 
		RULE_print_stmt = 4, RULE_train_markov_stmt = 5, RULE_find_genes_stmt = 6, 
		RULE_markov_config = 7, RULE_markov_params = 8, RULE_markov_param = 9, 
		RULE_query_stmt = 10, RULE_source = 11, RULE_where_clause = 12, RULE_select_clause = 13, 
		RULE_select_list = 14, RULE_select_item = 15, RULE_limit_clause = 16, 
		RULE_condition = 17, RULE_comparison = 18, RULE_comp_op = 19, RULE_expression = 20, 
		RULE_expr_list = 21, RULE_function_call = 22, RULE_arg_list = 23, RULE_func_name = 24, 
		RULE_basic_func = 25, RULE_agg_func = 26, RULE_literal = 27, RULE_percentage = 28, 
		RULE_sequence_literal = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "import_stmt", "assignment_stmt", "print_stmt", "train_markov_stmt", 
			"find_genes_stmt", "markov_config", "markov_params", "markov_param", 
			"query_stmt", "source", "where_clause", "select_clause", "select_list", 
			"select_item", "limit_clause", "condition", "comparison", "comp_op", 
			"expression", "expr_list", "function_call", "arg_list", "func_name", 
			"basic_func", "agg_func", "literal", "percentage", "sequence_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'IMPORT'", "'AS'", "'='", "'PRINT'", "'TRAIN_MARKOV'", 
			"'ON'", "'WITH'", "'FIND_GENES'", "'IN'", "'USING'", "'markov'", "'('", 
			"')'", "','", "'order'", "'threshold'", "'min_length'", "'model'", "'window'", 
			"'FIND'", "'sequences'", "'FROM'", "'WHERE'", "'SELECT'", "'LIMIT'", 
			"'AND'", "'OR'", "'NOT'", "'CONTAINS'", "'BETWEEN'", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'*'", "'/'", "'%'", "'+'", "'-'", "'.'", "'~'", "'<-'", 
			"'~<-'", "'length'", "'gc_content'", "'complement'", "'reverse'", "'translate'", 
			"'COUNT'", "'AVG'", "'MIN'", "'MAX'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "DNA_SEQ", "RNA_SEQ", 
			"PROTEIN_SEQ", "BOOLEAN", "NUMBER", "STRING", "ID", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "biolingo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public biolingoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(biolingoParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				stmt();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018429485670L) != 0) );
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Query_stmtContext query_stmt() {
			return getRuleContext(Query_stmtContext.class,0);
		}
		public Find_genes_stmtContext find_genes_stmt() {
			return getRuleContext(Find_genes_stmtContext.class,0);
		}
		public Train_markov_stmtContext train_markov_stmt() {
			return getRuleContext(Train_markov_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				import_stmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				assignment_stmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				query_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				find_genes_stmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				train_markov_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				print_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(biolingoParser.STRING, 0); }
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__1);
			setState(77);
			match(STRING);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(78);
				match(T__2);
				setState(79);
				match(ID);
				}
			}

			setState(82);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(T__3);
			setState(86);
			expression(0);
			setState(87);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__4);
			setState(90);
			expression(0);
			setState(91);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Train_markov_stmtContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Markov_paramsContext markov_params() {
			return getRuleContext(Markov_paramsContext.class,0);
		}
		public Train_markov_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_train_markov_stmt; }
	}

	public final Train_markov_stmtContext train_markov_stmt() throws RecognitionException {
		Train_markov_stmtContext _localctx = new Train_markov_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_train_markov_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__5);
			setState(94);
			match(T__6);
			setState(95);
			source();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(96);
				match(T__7);
				setState(97);
				markov_params();
				}
			}

			setState(100);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Find_genes_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Markov_configContext markov_config() {
			return getRuleContext(Markov_configContext.class,0);
		}
		public Find_genes_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find_genes_stmt; }
	}

	public final Find_genes_stmtContext find_genes_stmt() throws RecognitionException {
		Find_genes_stmtContext _localctx = new Find_genes_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_find_genes_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
			setState(103);
			match(T__9);
			setState(104);
			expression(0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(105);
				match(T__10);
				setState(106);
				markov_config();
				}
			}

			setState(109);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Markov_configContext extends ParserRuleContext {
		public Markov_paramsContext markov_params() {
			return getRuleContext(Markov_paramsContext.class,0);
		}
		public Markov_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markov_config; }
	}

	public final Markov_configContext markov_config() throws RecognitionException {
		Markov_configContext _localctx = new Markov_configContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_markov_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__11);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(112);
				match(T__12);
				setState(113);
				markov_params();
				setState(114);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Markov_paramsContext extends ParserRuleContext {
		public List<Markov_paramContext> markov_param() {
			return getRuleContexts(Markov_paramContext.class);
		}
		public Markov_paramContext markov_param(int i) {
			return getRuleContext(Markov_paramContext.class,i);
		}
		public Markov_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markov_params; }
	}

	public final Markov_paramsContext markov_params() throws RecognitionException {
		Markov_paramsContext _localctx = new Markov_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_markov_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			markov_param();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(119);
				match(T__14);
				setState(120);
				markov_param();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Markov_paramContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(biolingoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(biolingoParser.STRING, 0); }
		public Markov_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markov_param; }
	}

	public final Markov_paramContext markov_param() throws RecognitionException {
		Markov_paramContext _localctx = new Markov_paramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_markov_param);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__15);
				setState(127);
				match(T__3);
				setState(128);
				match(NUMBER);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__16);
				setState(130);
				match(T__3);
				setState(131);
				match(NUMBER);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__17);
				setState(133);
				match(T__3);
				setState(134);
				match(NUMBER);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__18);
				setState(136);
				match(T__3);
				setState(137);
				match(STRING);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(T__19);
				setState(139);
				match(T__3);
				setState(140);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_stmtContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Query_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_stmt; }
	}

	public final Query_stmtContext query_stmt() throws RecognitionException {
		Query_stmtContext _localctx = new Query_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__20);
			setState(144);
			match(T__21);
			setState(145);
			match(T__22);
			setState(146);
			source();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(147);
				where_clause();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(150);
				select_clause();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(153);
				limit_clause();
				}
			}

			setState(156);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(biolingoParser.STRING, 0); }
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__23);
			setState(161);
			condition(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_clauseContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__24);
			setState(164);
			select_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_itemContext> select_item() {
			return getRuleContexts(Select_itemContext.class);
		}
		public Select_itemContext select_item(int i) {
			return getRuleContext(Select_itemContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			select_item();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(167);
				match(T__14);
				setState(168);
				select_item();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public Select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_item; }
	}

	public final Select_itemContext select_item() throws RecognitionException {
		Select_itemContext _localctx = new Select_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(175);
				match(T__2);
				setState(176);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(biolingoParser.NUMBER, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__25);
			setState(180);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(183);
				match(T__28);
				setState(184);
				condition(3);
				}
				break;
			case 2:
				{
				setState(185);
				match(T__12);
				setState(186);
				condition(0);
				setState(187);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(189);
				comparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193);
						match(T__26);
						setState(194);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						match(T__27);
						setState(197);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparison);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				expression(0);
				setState(204);
				comp_op();
				setState(205);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expression(0);
				setState(208);
				match(T__29);
				setState(209);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				expression(0);
				setState(212);
				match(T__30);
				setState(213);
				expression(0);
				setState(214);
				match(T__26);
				setState(215);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				expression(0);
				setState(218);
				match(T__9);
				setState(219);
				match(T__12);
				setState(220);
				expr_list();
				setState(221);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 133143986192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(228);
				match(T__42);
				setState(229);
				expression(8);
				}
				break;
			case 2:
				{
				setState(230);
				match(T__43);
				setState(231);
				expression(7);
				}
				break;
			case 3:
				{
				setState(232);
				match(T__44);
				setState(233);
				expression(6);
				}
				break;
			case 4:
				{
				setState(234);
				match(T__40);
				setState(235);
				expression(5);
				}
				break;
			case 5:
				{
				setState(236);
				match(T__12);
				setState(237);
				expression(0);
				setState(238);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(240);
				function_call();
				}
				break;
			case 7:
				{
				setState(241);
				literal();
				}
				break;
			case 8:
				{
				setState(242);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(246);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(252);
						match(T__41);
						setState(253);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expression(0);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(260);
				match(T__14);
				setState(261);
				expression(0);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Func_nameContext func_name() {
			return getRuleContext(Func_nameContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			func_name();
			setState(268);
			match(T__12);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9223365439785017344L) != 0)) {
				{
				setState(269);
				arg_list();
				}
			}

			setState(272);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			expression(0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(275);
				match(T__14);
				setState(276);
				expression(0);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_nameContext extends ParserRuleContext {
		public Basic_funcContext basic_func() {
			return getRuleContext(Basic_funcContext.class,0);
		}
		public Agg_funcContext agg_func() {
			return getRuleContext(Agg_funcContext.class,0);
		}
		public TerminalNode ID() { return getToken(biolingoParser.ID, 0); }
		public Func_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_name; }
	}

	public final Func_nameContext func_name() throws RecognitionException {
		Func_nameContext _localctx = new Func_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func_name);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				basic_func();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				agg_func();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Basic_funcContext extends ParserRuleContext {
		public Basic_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_func; }
	}

	public final Basic_funcContext basic_func() throws RecognitionException {
		Basic_funcContext _localctx = new Basic_funcContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181431069507584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Agg_funcContext extends ParserRuleContext {
		public Agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_func; }
	}

	public final Agg_funcContext agg_func() throws RecognitionException {
		Agg_funcContext _localctx = new Agg_funcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_agg_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(biolingoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(biolingoParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(biolingoParser.BOOLEAN, 0); }
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public Sequence_literalContext sequence_literal() {
			return getRuleContext(Sequence_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				percentage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				sequence_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(biolingoParser.NUMBER, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_percentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(NUMBER);
			setState(299);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sequence_literalContext extends ParserRuleContext {
		public TerminalNode DNA_SEQ() { return getToken(biolingoParser.DNA_SEQ, 0); }
		public TerminalNode RNA_SEQ() { return getToken(biolingoParser.RNA_SEQ, 0); }
		public TerminalNode PROTEIN_SEQ() { return getToken(biolingoParser.PROTEIN_SEQ, 0); }
		public Sequence_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_literal; }
	}

	public final Sequence_literalContext sequence_literal() throws RecognitionException {
		Sequence_literalContext _localctx = new Sequence_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sequence_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504403158265495552L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0130\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0004\u0000"+
		">\b\u0000\u000b\u0000\f\u0000?\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002Q\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007u\b\u0007\u0001\b\u0001\b\u0001\b\u0005\bz\b\b\n\b\f\b}\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008e\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0095\b\n\u0001\n\u0003\n\u0098\b\n"+
		"\u0001\n\u0003\n\u009b\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00aa\b\u000e\n\u000e\f\u000e\u00ad\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b2\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bf\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00c7\b\u0011\n\u0011\f\u0011\u00ca\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00e0\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00ff\b\u0014\n\u0014\f\u0014\u0102\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0107\b\u0015\n\u0015\f\u0015\u010a"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010f\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0116\b\u0017\n\u0017\f\u0017\u0119\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u011e\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0129\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0000\u0002\"(\u001e\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"\u0000\u0007\u0001\u0000=>\u0002\u0000\u0004\u0004 $\u0001\u0000%\'\u0001"+
		"\u0000()\u0001\u0000.2\u0001\u000037\u0001\u00008:\u0140\u0000=\u0001"+
		"\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000"+
		"\u0000\u0006T\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n]\u0001"+
		"\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000eo\u0001\u0000\u0000"+
		"\u0000\u0010v\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000\u0000\u0000"+
		"\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000\u0000"+
		"\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000"+
		"\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000\u0000"+
		" \u00b3\u0001\u0000\u0000\u0000\"\u00be\u0001\u0000\u0000\u0000$\u00df"+
		"\u0001\u0000\u0000\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000"+
		"\u0000\u0000*\u0103\u0001\u0000\u0000\u0000,\u010b\u0001\u0000\u0000\u0000"+
		".\u0112\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u00002\u011f"+
		"\u0001\u0000\u0000\u00004\u0121\u0001\u0000\u0000\u00006\u0128\u0001\u0000"+
		"\u0000\u00008\u012a\u0001\u0000\u0000\u0000:\u012d\u0001\u0000\u0000\u0000"+
		"<>\u0003\u0002\u0001\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000\u0000\u0000"+
		"CK\u0003\u0004\u0002\u0000DK\u0003\u0006\u0003\u0000EK\u0003\u0014\n\u0000"+
		"FK\u0003\f\u0006\u0000GK\u0003\n\u0005\u0000HK\u0003\b\u0004\u0000IK\u0005"+
		"\u0001\u0000\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000"+
		"JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0003\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0002\u0000\u0000MP\u0005=\u0000\u0000NO\u0005"+
		"\u0003\u0000\u0000OQ\u0005>\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0001\u0000\u0000"+
		"S\u0005\u0001\u0000\u0000\u0000TU\u0005>\u0000\u0000UV\u0005\u0004\u0000"+
		"\u0000VW\u0003(\u0014\u0000WX\u0005\u0001\u0000\u0000X\u0007\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0003(\u0014\u0000[\\\u0005\u0001"+
		"\u0000\u0000\\\t\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0005"+
		"\u0007\u0000\u0000_b\u0003\u0016\u000b\u0000`a\u0005\b\u0000\u0000ac\u0003"+
		"\u0010\b\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0005\u0001\u0000\u0000e\u000b\u0001\u0000\u0000"+
		"\u0000fg\u0005\t\u0000\u0000gh\u0005\n\u0000\u0000hk\u0003(\u0014\u0000"+
		"ij\u0005\u000b\u0000\u0000jl\u0003\u000e\u0007\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u0001"+
		"\u0000\u0000n\r\u0001\u0000\u0000\u0000ot\u0005\f\u0000\u0000pq\u0005"+
		"\r\u0000\u0000qr\u0003\u0010\b\u0000rs\u0005\u000e\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u000f\u0001\u0000\u0000\u0000v{\u0003\u0012\t\u0000wx\u0005\u000f\u0000"+
		"\u0000xz\u0003\u0012\t\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0011\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0010\u0000"+
		"\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u008e\u0005<\u0000\u0000"+
		"\u0081\u0082\u0005\u0011\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000"+
		"\u0083\u008e\u0005<\u0000\u0000\u0084\u0085\u0005\u0012\u0000\u0000\u0085"+
		"\u0086\u0005\u0004\u0000\u0000\u0086\u008e\u0005<\u0000\u0000\u0087\u0088"+
		"\u0005\u0013\u0000\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u008e"+
		"\u0005=\u0000\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008c\u0005"+
		"\u0004\u0000\u0000\u008c\u008e\u0005<\u0000\u0000\u008d~\u0001\u0000\u0000"+
		"\u0000\u008d\u0081\u0001\u0000\u0000\u0000\u008d\u0084\u0001\u0000\u0000"+
		"\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0015\u0000"+
		"\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u0091\u0092\u0005\u0017\u0000"+
		"\u0000\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0095\u0003\u0018\f\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u001a\r\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003 \u0010\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u0015"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0000\u0000\u0000\u009f\u0017"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0018\u0000\u0000\u00a1\u00a2"+
		"\u0003\"\u0011\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0019\u0000\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u001b\u0001"+
		"\u0000\u0000\u0000\u00a6\u00ab\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005"+
		"\u000f\u0000\u0000\u00a8\u00aa\u0003\u001e\u000f\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u001d\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b1\u0003"+
		"(\u0014\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b2\u0005>\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001a\u0000"+
		"\u0000\u00b4\u00b5\u0005<\u0000\u0000\u00b5!\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0006\u0011\uffff\uffff\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000"+
		"\u00b8\u00bf\u0003\"\u0011\u0003\u00b9\u00ba\u0005\r\u0000\u0000\u00ba"+
		"\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0005\u000e\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003$\u0012\u0000\u00be\u00b6\u0001"+
		"\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c8\u0001\u0000\u0000\u0000\u00c0\u00c1\n\u0005"+
		"\u0000\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c7\u0003\"\u0011"+
		"\u0006\u00c3\u00c4\n\u0004\u0000\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000"+
		"\u00c5\u00c7\u0003\"\u0011\u0005\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"#\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0003(\u0014\u0000\u00cc\u00cd\u0003&\u0013\u0000\u00cd\u00ce\u0003("+
		"\u0014\u0000\u00ce\u00e0\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003(\u0014"+
		"\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d2\u0003(\u0014\u0000"+
		"\u00d2\u00e0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003(\u0014\u0000\u00d4"+
		"\u00d5\u0005\u001f\u0000\u0000\u00d5\u00d6\u0003(\u0014\u0000\u00d6\u00d7"+
		"\u0005\u001b\u0000\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8\u00e0\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0003(\u0014\u0000\u00da\u00db\u0005\n"+
		"\u0000\u0000\u00db\u00dc\u0005\r\u0000\u0000\u00dc\u00dd\u0003*\u0015"+
		"\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00cb\u0001\u0000\u0000\u0000\u00df\u00cf\u0001\u0000\u0000"+
		"\u0000\u00df\u00d3\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000"+
		"\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0001\u0000\u0000"+
		"\u00e2\'\u0001\u0000\u0000\u0000\u00e3\u00e4\u0006\u0014\uffff\uffff\u0000"+
		"\u00e4\u00e5\u0005+\u0000\u0000\u00e5\u00f4\u0003(\u0014\b\u00e6\u00e7"+
		"\u0005,\u0000\u0000\u00e7\u00f4\u0003(\u0014\u0007\u00e8\u00e9\u0005-"+
		"\u0000\u0000\u00e9\u00f4\u0003(\u0014\u0006\u00ea\u00eb\u0005)\u0000\u0000"+
		"\u00eb\u00f4\u0003(\u0014\u0005\u00ec\u00ed\u0005\r\u0000\u0000\u00ed"+
		"\u00ee\u0003(\u0014\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000\u00ef\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f4\u0003,\u0016\u0000\u00f1\u00f4\u0003"+
		"6\u001b\u0000\u00f2\u00f4\u0005>\u0000\u0000\u00f3\u00e3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00e6\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ea\u0001\u0000\u0000\u0000\u00f3\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u0100\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\n\u000b\u0000\u0000\u00f6\u00f7\u0007\u0002\u0000\u0000"+
		"\u00f7\u00ff\u0003(\u0014\f\u00f8\u00f9\n\n\u0000\u0000\u00f9\u00fa\u0007"+
		"\u0003\u0000\u0000\u00fa\u00ff\u0003(\u0014\u000b\u00fb\u00fc\n\t\u0000"+
		"\u0000\u00fc\u00fd\u0005*\u0000\u0000\u00fd\u00ff\u0005>\u0000\u0000\u00fe"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fb\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		")\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0108"+
		"\u0003(\u0014\u0000\u0104\u0105\u0005\u000f\u0000\u0000\u0105\u0107\u0003"+
		"(\u0014\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109+\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u00030\u0018\u0000\u010c\u010e\u0005\r\u0000\u0000"+
		"\u010d\u010f\u0003.\u0017\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u000e\u0000\u0000\u0111-\u0001\u0000\u0000\u0000\u0112\u0117"+
		"\u0003(\u0014\u0000\u0113\u0114\u0005\u000f\u0000\u0000\u0114\u0116\u0003"+
		"(\u0014\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118/\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011e\u00032\u0019\u0000\u011b\u011e\u00034\u001a\u0000\u011c"+
		"\u011e\u0005>\u0000\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e1\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0007\u0004\u0000\u0000\u01203\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0007\u0005\u0000\u0000\u01225\u0001\u0000\u0000"+
		"\u0000\u0123\u0129\u0005<\u0000\u0000\u0124\u0129\u0005=\u0000\u0000\u0125"+
		"\u0129\u0005;\u0000\u0000\u0126\u0129\u00038\u001c\u0000\u0127\u0129\u0003"+
		":\u001d\u0000\u0128\u0123\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u01297\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005<\u0000\u0000\u012b\u012c\u0005\'\u0000\u0000"+
		"\u012c9\u0001\u0000\u0000\u0000\u012d\u012e\u0007\u0006\u0000\u0000\u012e"+
		";\u0001\u0000\u0000\u0000\u0019?JPbkt{\u008d\u0094\u0097\u009a\u00ab\u00b1"+
		"\u00be\u00c6\u00c8\u00df\u00f3\u00fe\u0100\u0108\u010e\u0117\u011d\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}