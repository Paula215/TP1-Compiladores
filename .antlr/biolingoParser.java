// Generated from /home/pauz/Documents/Compi/tp1/biolingo.g4 by ANTLR 4.13.1
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, DNA_SEQ=59, 
		RNA_SEQ=60, PROTEIN_SEQ=61, BOOLEAN=62, NUMBER=63, STRING=64, ID=65, LINE_COMMENT=66, 
		BLOCK_COMMENT=67, WS=68;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_import_stmt = 2, RULE_assignment_stmt = 3, 
		RULE_print_stmt = 4, RULE_train_markov_stmt = 5, RULE_find_genes_stmt = 6, 
		RULE_markov_config = 7, RULE_markov_params = 8, RULE_markov_param = 9, 
		RULE_query_stmt = 10, RULE_source = 11, RULE_where_clause = 12, RULE_select_clause = 13, 
		RULE_select_list = 14, RULE_select_item = 15, RULE_limit_clause = 16, 
		RULE_condition = 17, RULE_comparison = 18, RULE_comp_op = 19, RULE_expression = 20, 
		RULE_bio_seq = 21, RULE_expr_list = 22, RULE_function_call = 23, RULE_arg_list = 24, 
		RULE_func_name = 25, RULE_basic_func = 26, RULE_agg_func = 27, RULE_literal = 28, 
		RULE_percentage = 29, RULE_sequence_literal = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "import_stmt", "assignment_stmt", "print_stmt", "train_markov_stmt", 
			"find_genes_stmt", "markov_config", "markov_params", "markov_param", 
			"query_stmt", "source", "where_clause", "select_clause", "select_list", 
			"select_item", "limit_clause", "condition", "comparison", "comp_op", 
			"expression", "bio_seq", "expr_list", "function_call", "arg_list", "func_name", 
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
			"'~<-'", "'DNA'", "'RNA'", "'PROTEIN'", "'length'", "'gc_content'", "'complement'", 
			"'reverse'", "'translate'", "'COUNT'", "'AVG'", "'MIN'", "'MAX'", "'SUM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DNA_SEQ", 
			"RNA_SEQ", "PROTEIN_SEQ", "BOOLEAN", "NUMBER", "STRING", "ID", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				stmt();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2097766L) != 0) || _la==ID );
			setState(67);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				import_stmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				assignment_stmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				query_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				find_genes_stmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				train_markov_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				print_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
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
			setState(78);
			match(T__1);
			setState(79);
			match(STRING);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				match(T__2);
				setState(81);
				match(ID);
				}
			}

			setState(84);
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
			setState(86);
			match(ID);
			setState(87);
			match(T__3);
			setState(88);
			expression(0);
			setState(89);
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
			setState(91);
			match(T__4);
			setState(92);
			expression(0);
			setState(93);
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
			setState(95);
			match(T__5);
			setState(96);
			match(T__6);
			setState(97);
			source();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(98);
				match(T__7);
				setState(99);
				markov_params();
				}
			}

			setState(102);
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
			setState(104);
			match(T__8);
			setState(105);
			match(T__9);
			setState(106);
			expression(0);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(107);
				match(T__10);
				setState(108);
				markov_config();
				}
			}

			setState(111);
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
			setState(113);
			match(T__11);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(114);
				match(T__12);
				setState(115);
				markov_params();
				setState(116);
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
			setState(120);
			markov_param();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(121);
				match(T__14);
				setState(122);
				markov_param();
				}
				}
				setState(127);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__15);
				setState(129);
				match(T__3);
				setState(130);
				match(NUMBER);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__16);
				setState(132);
				match(T__3);
				setState(133);
				match(NUMBER);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__17);
				setState(135);
				match(T__3);
				setState(136);
				match(NUMBER);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__18);
				setState(138);
				match(T__3);
				setState(139);
				match(STRING);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__19);
				setState(141);
				match(T__3);
				setState(142);
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
			setState(145);
			match(T__20);
			setState(146);
			match(T__21);
			setState(147);
			match(T__22);
			setState(148);
			source();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(149);
				where_clause();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(152);
				select_clause();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(155);
				limit_clause();
				}
			}

			setState(158);
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
			setState(160);
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
			setState(162);
			match(T__23);
			setState(163);
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
			setState(165);
			match(T__24);
			setState(166);
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
			setState(168);
			select_item();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(169);
				match(T__14);
				setState(170);
				select_item();
				}
				}
				setState(175);
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
			setState(176);
			expression(0);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(177);
				match(T__2);
				setState(178);
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
			setState(181);
			match(T__25);
			setState(182);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(185);
				match(T__28);
				setState(186);
				condition(3);
				}
				break;
			case 2:
				{
				setState(187);
				match(T__12);
				setState(188);
				condition(0);
				setState(189);
				match(T__13);
				}
				break;
			case 3:
				{
				setState(191);
				comparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						match(T__26);
						setState(196);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(T__27);
						setState(199);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(204);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				expression(0);
				setState(206);
				comp_op();
				setState(207);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				expression(0);
				setState(210);
				match(T__29);
				setState(211);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				expression(0);
				setState(214);
				match(T__30);
				setState(215);
				expression(0);
				setState(216);
				match(T__26);
				setState(217);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				expression(0);
				setState(220);
				match(T__9);
				setState(221);
				match(T__12);
				setState(222);
				expr_list();
				setState(223);
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
			setState(227);
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
		public Bio_seqContext bio_seq() {
			return getRuleContext(Bio_seqContext.class,0);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(230);
				match(T__42);
				setState(231);
				expression(9);
				}
				break;
			case 2:
				{
				setState(232);
				match(T__43);
				setState(233);
				expression(8);
				}
				break;
			case 3:
				{
				setState(234);
				match(T__44);
				setState(235);
				expression(7);
				}
				break;
			case 4:
				{
				setState(236);
				match(T__40);
				setState(237);
				expression(6);
				}
				break;
			case 5:
				{
				setState(238);
				match(T__12);
				setState(239);
				expression(0);
				setState(240);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(242);
				function_call();
				}
				break;
			case 7:
				{
				setState(243);
				literal();
				}
				break;
			case 8:
				{
				setState(244);
				bio_seq();
				}
				break;
			case 9:
				{
				setState(245);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(249);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(252);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(255);
						match(T__41);
						setState(256);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(261);
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
	public static class Bio_seqContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(biolingoParser.STRING, 0); }
		public Bio_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bio_seq; }
	}

	public final Bio_seqContext bio_seq() throws RecognitionException {
		Bio_seqContext _localctx = new Bio_seqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bio_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(263);
			match(STRING);
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
		enterRule(_localctx, 44, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			expression(0);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(266);
				match(T__14);
				setState(267);
				expression(0);
				}
				}
				setState(272);
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
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			func_name();
			setState(274);
			match(T__12);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 9007198449434625L) != 0)) {
				{
				setState(275);
				arg_list();
				}
			}

			setState(278);
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
		enterRule(_localctx, 48, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression(0);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(281);
				match(T__14);
				setState(282);
				expression(0);
				}
				}
				setState(287);
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
		enterRule(_localctx, 50, RULE_func_name);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				basic_func();
				}
				break;
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				agg_func();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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
		enterRule(_localctx, 52, RULE_basic_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060672L) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_agg_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 558446353793941504L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				percentage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
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
		enterRule(_localctx, 58, RULE_percentage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(NUMBER);
			setState(305);
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
		enterRule(_localctx, 60, RULE_sequence_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964416L) != 0)) ) {
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
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002S\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b|\b\b\n\b\f\b\u007f\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0090\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0097"+
		"\b\n\u0001\n\u0003\n\u009a\b\n\u0001\n\u0003\n\u009d\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ac\b\u000e\n\u000e"+
		"\f\u000e\u00af\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b4\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00c1\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00c9\b\u0011\n\u0011\f\u0011\u00cc"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00f7\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0102"+
		"\b\u0014\n\u0014\f\u0014\u0105\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u010d\b\u0016\n\u0016"+
		"\f\u0016\u0110\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0115\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u011c\b\u0018\n\u0018\f\u0018\u011f\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0124\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u012f\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0000\u0002\"(\u001f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<\u0000\b\u0001\u0000@A\u0002\u0000\u0004\u0004 $\u0001\u0000"+
		"%\'\u0001\u0000()\u0001\u0000.0\u0001\u000015\u0001\u00006:\u0001\u0000"+
		";=\u0146\u0000?\u0001\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000"+
		"\u0004N\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b[\u0001"+
		"\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000"+
		"\u000eq\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012\u008f"+
		"\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u00a0"+
		"\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00a5"+
		"\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00b0"+
		"\u0001\u0000\u0000\u0000 \u00b5\u0001\u0000\u0000\u0000\"\u00c0\u0001"+
		"\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000\u0000&\u00e3\u0001\u0000\u0000"+
		"\u0000(\u00f6\u0001\u0000\u0000\u0000*\u0106\u0001\u0000\u0000\u0000,"+
		"\u0109\u0001\u0000\u0000\u0000.\u0111\u0001\u0000\u0000\u00000\u0118\u0001"+
		"\u0000\u0000\u00002\u0123\u0001\u0000\u0000\u00004\u0125\u0001\u0000\u0000"+
		"\u00006\u0127\u0001\u0000\u0000\u00008\u012e\u0001\u0000\u0000\u0000:"+
		"\u0130\u0001\u0000\u0000\u0000<\u0133\u0001\u0000\u0000\u0000>@\u0003"+
		"\u0002\u0001\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000\u0000\u0000EM\u0003"+
		"\u0004\u0002\u0000FM\u0003\u0006\u0003\u0000GM\u0003\u0014\n\u0000HM\u0003"+
		"\f\u0006\u0000IM\u0003\n\u0005\u0000JM\u0003\b\u0004\u0000KM\u0005\u0001"+
		"\u0000\u0000LE\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001"+
		"\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0003\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0002\u0000\u0000OR\u0005@\u0000\u0000PQ\u0005\u0003"+
		"\u0000\u0000QS\u0005A\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000U\u0005"+
		"\u0001\u0000\u0000\u0000VW\u0005A\u0000\u0000WX\u0005\u0004\u0000\u0000"+
		"XY\u0003(\u0014\u0000YZ\u0005\u0001\u0000\u0000Z\u0007\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0005\u0000\u0000\\]\u0003(\u0014\u0000]^\u0005\u0001"+
		"\u0000\u0000^\t\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`a\u0005"+
		"\u0007\u0000\u0000ad\u0003\u0016\u000b\u0000bc\u0005\b\u0000\u0000ce\u0003"+
		"\u0010\b\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0005\u0001\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hi\u0005\t\u0000\u0000ij\u0005\n\u0000\u0000jm\u0003(\u0014\u0000"+
		"kl\u0005\u000b\u0000\u0000ln\u0003\u000e\u0007\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\u0001"+
		"\u0000\u0000p\r\u0001\u0000\u0000\u0000qv\u0005\f\u0000\u0000rs\u0005"+
		"\r\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u000e\u0000\u0000uw\u0001"+
		"\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u000f\u0001\u0000\u0000\u0000x}\u0003\u0012\t\u0000yz\u0005\u000f\u0000"+
		"\u0000z|\u0003\u0012\t\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0011"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0010\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0090\u0005"+
		"?\u0000\u0000\u0083\u0084\u0005\u0011\u0000\u0000\u0084\u0085\u0005\u0004"+
		"\u0000\u0000\u0085\u0090\u0005?\u0000\u0000\u0086\u0087\u0005\u0012\u0000"+
		"\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0090\u0005?\u0000\u0000"+
		"\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0005\u0004\u0000\u0000"+
		"\u008b\u0090\u0005@\u0000\u0000\u008c\u008d\u0005\u0014\u0000\u0000\u008d"+
		"\u008e\u0005\u0004\u0000\u0000\u008e\u0090\u0005?\u0000\u0000\u008f\u0080"+
		"\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000\u0000\u0000\u008f\u0086"+
		"\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008c"+
		"\u0001\u0000\u0000\u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0015\u0000\u0000\u0092\u0093\u0005\u0016\u0000\u0000\u0093\u0094"+
		"\u0005\u0017\u0000\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0097"+
		"\u0003\u0018\f\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u009a\u0003"+
		"\u001a\r\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0003 \u0010"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0001\u0000"+
		"\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000"+
		"\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0018\u0000"+
		"\u0000\u00a3\u00a4\u0003\"\u0011\u0000\u00a4\u0019\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a7\u0003\u001c\u000e\u0000"+
		"\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00ad\u0003\u001e\u000f\u0000"+
		"\u00a9\u00aa\u0005\u000f\u0000\u0000\u00aa\u00ac\u0003\u001e\u000f\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b3\u0003(\u0014\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2"+
		"\u00b4\u0005A\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u001a\u0000\u0000\u00b6\u00b7\u0005?\u0000\u0000\u00b7!\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0006\u0011\uffff\uffff\u0000\u00b9\u00ba\u0005"+
		"\u001d\u0000\u0000\u00ba\u00c1\u0003\"\u0011\u0003\u00bb\u00bc\u0005\r"+
		"\u0000\u0000\u00bc\u00bd\u0003\"\u0011\u0000\u00bd\u00be\u0005\u000e\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00c1\u0003$\u0012\u0000"+
		"\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\n\u0005\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4"+
		"\u00c9\u0003\"\u0011\u0006\u00c5\u00c6\n\u0004\u0000\u0000\u00c6\u00c7"+
		"\u0005\u001c\u0000\u0000\u00c7\u00c9\u0003\"\u0011\u0005\u00c8\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0003(\u0014\u0000\u00ce\u00cf\u0003&\u0013\u0000"+
		"\u00cf\u00d0\u0003(\u0014\u0000\u00d0\u00e2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0003(\u0014\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3\u00d4"+
		"\u0003(\u0014\u0000\u00d4\u00e2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003"+
		"(\u0014\u0000\u00d6\u00d7\u0005\u001f\u0000\u0000\u00d7\u00d8\u0003(\u0014"+
		"\u0000\u00d8\u00d9\u0005\u001b\u0000\u0000\u00d9\u00da\u0003(\u0014\u0000"+
		"\u00da\u00e2\u0001\u0000\u0000\u0000\u00db\u00dc\u0003(\u0014\u0000\u00dc"+
		"\u00dd\u0005\n\u0000\u0000\u00dd\u00de\u0005\r\u0000\u0000\u00de\u00df"+
		"\u0003,\u0016\u0000\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00cd\u0001\u0000\u0000\u0000\u00e1\u00d1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00d5\u0001\u0000\u0000\u0000\u00e1\u00db\u0001"+
		"\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\u0001"+
		"\u0000\u0000\u00e4\'\u0001\u0000\u0000\u0000\u00e5\u00e6\u0006\u0014\uffff"+
		"\uffff\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7\u00f7\u0003(\u0014\t"+
		"\u00e8\u00e9\u0005,\u0000\u0000\u00e9\u00f7\u0003(\u0014\b\u00ea\u00eb"+
		"\u0005-\u0000\u0000\u00eb\u00f7\u0003(\u0014\u0007\u00ec\u00ed\u0005)"+
		"\u0000\u0000\u00ed\u00f7\u0003(\u0014\u0006\u00ee\u00ef\u0005\r\u0000"+
		"\u0000\u00ef\u00f0\u0003(\u0014\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000"+
		"\u00f1\u00f7\u0001\u0000\u0000\u0000\u00f2\u00f7\u0003.\u0017\u0000\u00f3"+
		"\u00f7\u00038\u001c\u0000\u00f4\u00f7\u0003*\u0015\u0000\u00f5\u00f7\u0005"+
		"A\u0000\u0000\u00f6\u00e5\u0001\u0000\u0000\u0000\u00f6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ea\u0001\u0000\u0000\u0000\u00f6\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u0103\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\n\f\u0000\u0000\u00f9\u00fa\u0007\u0002\u0000"+
		"\u0000\u00fa\u0102\u0003(\u0014\r\u00fb\u00fc\n\u000b\u0000\u0000\u00fc"+
		"\u00fd\u0007\u0003\u0000\u0000\u00fd\u0102\u0003(\u0014\f\u00fe\u00ff"+
		"\n\n\u0000\u0000\u00ff\u0100\u0005*\u0000\u0000\u0100\u0102\u0005A\u0000"+
		"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000"+
		"\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104)\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0007\u0004\u0000\u0000\u0107\u0108\u0005@\u0000\u0000\u0108"+
		"+\u0001\u0000\u0000\u0000\u0109\u010e\u0003(\u0014\u0000\u010a\u010b\u0005"+
		"\u000f\u0000\u0000\u010b\u010d\u0003(\u0014\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f-\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u00032\u0019\u0000"+
		"\u0112\u0114\u0005\r\u0000\u0000\u0113\u0115\u00030\u0018\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u000e\u0000\u0000\u0117"+
		"/\u0001\u0000\u0000\u0000\u0118\u011d\u0003(\u0014\u0000\u0119\u011a\u0005"+
		"\u000f\u0000\u0000\u011a\u011c\u0003(\u0014\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e1\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0124\u00034\u001a\u0000"+
		"\u0121\u0124\u00036\u001b\u0000\u0122\u0124\u0005A\u0000\u0000\u0123\u0120"+
		"\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122"+
		"\u0001\u0000\u0000\u0000\u01243\u0001\u0000\u0000\u0000\u0125\u0126\u0007"+
		"\u0005\u0000\u0000\u01265\u0001\u0000\u0000\u0000\u0127\u0128\u0007\u0006"+
		"\u0000\u0000\u01287\u0001\u0000\u0000\u0000\u0129\u012f\u0005?\u0000\u0000"+
		"\u012a\u012f\u0005@\u0000\u0000\u012b\u012f\u0005>\u0000\u0000\u012c\u012f"+
		"\u0003:\u001d\u0000\u012d\u012f\u0003<\u001e\u0000\u012e\u0129\u0001\u0000"+
		"\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012f9\u0001\u0000\u0000\u0000\u0130\u0131\u0005?\u0000\u0000"+
		"\u0131\u0132\u0005\'\u0000\u0000\u0132;\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0007\u0007\u0000\u0000\u0134=\u0001\u0000\u0000\u0000\u0019AL"+
		"Rdmv}\u008f\u0096\u0099\u009c\u00ad\u00b3\u00c0\u00c8\u00ca\u00e1\u00f6"+
		"\u0101\u0103\u010e\u0114\u011d\u0123\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}