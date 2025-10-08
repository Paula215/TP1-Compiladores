# Generated from biolingo.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,68,310,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,1,0,4,0,64,8,0,11,0,12,0,
        65,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,77,8,1,1,2,1,2,1,2,1,
        2,3,2,83,8,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,5,1,5,
        1,5,1,5,1,5,3,5,101,8,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,3,6,110,8,6,
        1,6,1,6,1,7,1,7,1,7,1,7,1,7,3,7,119,8,7,1,8,1,8,1,8,5,8,124,8,8,
        10,8,12,8,127,9,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,
        9,1,9,1,9,1,9,3,9,144,8,9,1,10,1,10,1,10,1,10,1,10,3,10,151,8,10,
        1,10,3,10,154,8,10,1,10,3,10,157,8,10,1,10,1,10,1,11,1,11,1,12,1,
        12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,5,14,172,8,14,10,14,12,14,
        175,9,14,1,15,1,15,1,15,3,15,180,8,15,1,16,1,16,1,16,1,17,1,17,1,
        17,1,17,1,17,1,17,1,17,1,17,3,17,193,8,17,1,17,1,17,1,17,1,17,1,
        17,1,17,5,17,201,8,17,10,17,12,17,204,9,17,1,18,1,18,1,18,1,18,1,
        18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,
        18,1,18,1,18,3,18,226,8,18,1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,
        20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,3,20,247,
        8,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,20,5,20,258,8,20,
        10,20,12,20,261,9,20,1,21,1,21,1,21,1,22,1,22,1,22,5,22,269,8,22,
        10,22,12,22,272,9,22,1,23,1,23,1,23,3,23,277,8,23,1,23,1,23,1,24,
        1,24,1,24,5,24,284,8,24,10,24,12,24,287,9,24,1,25,1,25,1,25,3,25,
        292,8,25,1,26,1,26,1,27,1,27,1,28,1,28,1,28,1,28,1,28,3,28,303,8,
        28,1,29,1,29,1,29,1,30,1,30,1,30,0,2,34,40,31,0,2,4,6,8,10,12,14,
        16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,
        60,0,8,1,0,64,65,2,0,4,4,32,36,1,0,37,39,1,0,40,41,1,0,46,48,1,0,
        49,53,1,0,54,58,1,0,59,61,326,0,63,1,0,0,0,2,76,1,0,0,0,4,78,1,0,
        0,0,6,86,1,0,0,0,8,91,1,0,0,0,10,95,1,0,0,0,12,104,1,0,0,0,14,113,
        1,0,0,0,16,120,1,0,0,0,18,143,1,0,0,0,20,145,1,0,0,0,22,160,1,0,
        0,0,24,162,1,0,0,0,26,165,1,0,0,0,28,168,1,0,0,0,30,176,1,0,0,0,
        32,181,1,0,0,0,34,192,1,0,0,0,36,225,1,0,0,0,38,227,1,0,0,0,40,246,
        1,0,0,0,42,262,1,0,0,0,44,265,1,0,0,0,46,273,1,0,0,0,48,280,1,0,
        0,0,50,291,1,0,0,0,52,293,1,0,0,0,54,295,1,0,0,0,56,302,1,0,0,0,
        58,304,1,0,0,0,60,307,1,0,0,0,62,64,3,2,1,0,63,62,1,0,0,0,64,65,
        1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,66,67,1,0,0,0,67,68,5,0,0,1,
        68,1,1,0,0,0,69,77,3,4,2,0,70,77,3,6,3,0,71,77,3,20,10,0,72,77,3,
        12,6,0,73,77,3,10,5,0,74,77,3,8,4,0,75,77,5,1,0,0,76,69,1,0,0,0,
        76,70,1,0,0,0,76,71,1,0,0,0,76,72,1,0,0,0,76,73,1,0,0,0,76,74,1,
        0,0,0,76,75,1,0,0,0,77,3,1,0,0,0,78,79,5,2,0,0,79,82,5,64,0,0,80,
        81,5,3,0,0,81,83,5,65,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,84,1,0,
        0,0,84,85,5,1,0,0,85,5,1,0,0,0,86,87,5,65,0,0,87,88,5,4,0,0,88,89,
        3,40,20,0,89,90,5,1,0,0,90,7,1,0,0,0,91,92,5,5,0,0,92,93,3,40,20,
        0,93,94,5,1,0,0,94,9,1,0,0,0,95,96,5,6,0,0,96,97,5,7,0,0,97,100,
        3,22,11,0,98,99,5,8,0,0,99,101,3,16,8,0,100,98,1,0,0,0,100,101,1,
        0,0,0,101,102,1,0,0,0,102,103,5,1,0,0,103,11,1,0,0,0,104,105,5,9,
        0,0,105,106,5,10,0,0,106,109,3,40,20,0,107,108,5,11,0,0,108,110,
        3,14,7,0,109,107,1,0,0,0,109,110,1,0,0,0,110,111,1,0,0,0,111,112,
        5,1,0,0,112,13,1,0,0,0,113,118,5,12,0,0,114,115,5,13,0,0,115,116,
        3,16,8,0,116,117,5,14,0,0,117,119,1,0,0,0,118,114,1,0,0,0,118,119,
        1,0,0,0,119,15,1,0,0,0,120,125,3,18,9,0,121,122,5,15,0,0,122,124,
        3,18,9,0,123,121,1,0,0,0,124,127,1,0,0,0,125,123,1,0,0,0,125,126,
        1,0,0,0,126,17,1,0,0,0,127,125,1,0,0,0,128,129,5,16,0,0,129,130,
        5,4,0,0,130,144,5,63,0,0,131,132,5,17,0,0,132,133,5,4,0,0,133,144,
        5,63,0,0,134,135,5,18,0,0,135,136,5,4,0,0,136,144,5,63,0,0,137,138,
        5,19,0,0,138,139,5,4,0,0,139,144,5,64,0,0,140,141,5,20,0,0,141,142,
        5,4,0,0,142,144,5,63,0,0,143,128,1,0,0,0,143,131,1,0,0,0,143,134,
        1,0,0,0,143,137,1,0,0,0,143,140,1,0,0,0,144,19,1,0,0,0,145,146,5,
        21,0,0,146,147,5,22,0,0,147,148,5,23,0,0,148,150,3,22,11,0,149,151,
        3,24,12,0,150,149,1,0,0,0,150,151,1,0,0,0,151,153,1,0,0,0,152,154,
        3,26,13,0,153,152,1,0,0,0,153,154,1,0,0,0,154,156,1,0,0,0,155,157,
        3,32,16,0,156,155,1,0,0,0,156,157,1,0,0,0,157,158,1,0,0,0,158,159,
        5,1,0,0,159,21,1,0,0,0,160,161,7,0,0,0,161,23,1,0,0,0,162,163,5,
        24,0,0,163,164,3,34,17,0,164,25,1,0,0,0,165,166,5,25,0,0,166,167,
        3,28,14,0,167,27,1,0,0,0,168,173,3,30,15,0,169,170,5,15,0,0,170,
        172,3,30,15,0,171,169,1,0,0,0,172,175,1,0,0,0,173,171,1,0,0,0,173,
        174,1,0,0,0,174,29,1,0,0,0,175,173,1,0,0,0,176,179,3,40,20,0,177,
        178,5,3,0,0,178,180,5,65,0,0,179,177,1,0,0,0,179,180,1,0,0,0,180,
        31,1,0,0,0,181,182,5,26,0,0,182,183,5,63,0,0,183,33,1,0,0,0,184,
        185,6,17,-1,0,185,186,5,29,0,0,186,193,3,34,17,3,187,188,5,13,0,
        0,188,189,3,34,17,0,189,190,5,14,0,0,190,193,1,0,0,0,191,193,3,36,
        18,0,192,184,1,0,0,0,192,187,1,0,0,0,192,191,1,0,0,0,193,202,1,0,
        0,0,194,195,10,5,0,0,195,196,5,27,0,0,196,201,3,34,17,6,197,198,
        10,4,0,0,198,199,5,28,0,0,199,201,3,34,17,5,200,194,1,0,0,0,200,
        197,1,0,0,0,201,204,1,0,0,0,202,200,1,0,0,0,202,203,1,0,0,0,203,
        35,1,0,0,0,204,202,1,0,0,0,205,206,3,40,20,0,206,207,3,38,19,0,207,
        208,3,40,20,0,208,226,1,0,0,0,209,210,3,40,20,0,210,211,5,30,0,0,
        211,212,3,40,20,0,212,226,1,0,0,0,213,214,3,40,20,0,214,215,5,31,
        0,0,215,216,3,40,20,0,216,217,5,27,0,0,217,218,3,40,20,0,218,226,
        1,0,0,0,219,220,3,40,20,0,220,221,5,10,0,0,221,222,5,13,0,0,222,
        223,3,44,22,0,223,224,5,14,0,0,224,226,1,0,0,0,225,205,1,0,0,0,225,
        209,1,0,0,0,225,213,1,0,0,0,225,219,1,0,0,0,226,37,1,0,0,0,227,228,
        7,1,0,0,228,39,1,0,0,0,229,230,6,20,-1,0,230,231,5,43,0,0,231,247,
        3,40,20,9,232,233,5,44,0,0,233,247,3,40,20,8,234,235,5,45,0,0,235,
        247,3,40,20,7,236,237,5,41,0,0,237,247,3,40,20,6,238,239,5,13,0,
        0,239,240,3,40,20,0,240,241,5,14,0,0,241,247,1,0,0,0,242,247,3,46,
        23,0,243,247,3,56,28,0,244,247,3,42,21,0,245,247,5,65,0,0,246,229,
        1,0,0,0,246,232,1,0,0,0,246,234,1,0,0,0,246,236,1,0,0,0,246,238,
        1,0,0,0,246,242,1,0,0,0,246,243,1,0,0,0,246,244,1,0,0,0,246,245,
        1,0,0,0,247,259,1,0,0,0,248,249,10,12,0,0,249,250,7,2,0,0,250,258,
        3,40,20,13,251,252,10,11,0,0,252,253,7,3,0,0,253,258,3,40,20,12,
        254,255,10,10,0,0,255,256,5,42,0,0,256,258,5,65,0,0,257,248,1,0,
        0,0,257,251,1,0,0,0,257,254,1,0,0,0,258,261,1,0,0,0,259,257,1,0,
        0,0,259,260,1,0,0,0,260,41,1,0,0,0,261,259,1,0,0,0,262,263,7,4,0,
        0,263,264,5,64,0,0,264,43,1,0,0,0,265,270,3,40,20,0,266,267,5,15,
        0,0,267,269,3,40,20,0,268,266,1,0,0,0,269,272,1,0,0,0,270,268,1,
        0,0,0,270,271,1,0,0,0,271,45,1,0,0,0,272,270,1,0,0,0,273,274,3,50,
        25,0,274,276,5,13,0,0,275,277,3,48,24,0,276,275,1,0,0,0,276,277,
        1,0,0,0,277,278,1,0,0,0,278,279,5,14,0,0,279,47,1,0,0,0,280,285,
        3,40,20,0,281,282,5,15,0,0,282,284,3,40,20,0,283,281,1,0,0,0,284,
        287,1,0,0,0,285,283,1,0,0,0,285,286,1,0,0,0,286,49,1,0,0,0,287,285,
        1,0,0,0,288,292,3,52,26,0,289,292,3,54,27,0,290,292,5,65,0,0,291,
        288,1,0,0,0,291,289,1,0,0,0,291,290,1,0,0,0,292,51,1,0,0,0,293,294,
        7,5,0,0,294,53,1,0,0,0,295,296,7,6,0,0,296,55,1,0,0,0,297,303,5,
        63,0,0,298,303,5,64,0,0,299,303,5,62,0,0,300,303,3,58,29,0,301,303,
        3,60,30,0,302,297,1,0,0,0,302,298,1,0,0,0,302,299,1,0,0,0,302,300,
        1,0,0,0,302,301,1,0,0,0,303,57,1,0,0,0,304,305,5,63,0,0,305,306,
        5,39,0,0,306,59,1,0,0,0,307,308,7,7,0,0,308,61,1,0,0,0,25,65,76,
        82,100,109,118,125,143,150,153,156,173,179,192,200,202,225,246,257,
        259,270,276,285,291,302
    ]

class biolingoParser ( Parser ):

    grammarFileName = "biolingo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'IMPORT'", "'AS'", "'='", "'PRINT'", 
                     "'TRAIN_MARKOV'", "'ON'", "'WITH'", "'FIND_GENES'", 
                     "'IN'", "'USING'", "'markov'", "'('", "')'", "','", 
                     "'order'", "'threshold'", "'min_length'", "'model'", 
                     "'window'", "'FIND'", "'sequences'", "'FROM'", "'WHERE'", 
                     "'SELECT'", "'LIMIT'", "'AND'", "'OR'", "'NOT'", "'CONTAINS'", 
                     "'BETWEEN'", "'!='", "'<'", "'<='", "'>'", "'>='", 
                     "'*'", "'/'", "'%'", "'+'", "'-'", "'.'", "'~'", "'<-'", 
                     "'~<-'", "'DNA'", "'RNA'", "'PROTEIN'", "'length'", 
                     "'gc_content'", "'complement'", "'reverse'", "'translate'", 
                     "'COUNT'", "'AVG'", "'MIN'", "'MAX'", "'SUM'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "DNA_SEQ", 
                      "RNA_SEQ", "PROTEIN_SEQ", "BOOLEAN", "NUMBER", "STRING", 
                      "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS" ]

    RULE_program = 0
    RULE_stmt = 1
    RULE_import_stmt = 2
    RULE_assignment_stmt = 3
    RULE_print_stmt = 4
    RULE_train_markov_stmt = 5
    RULE_find_genes_stmt = 6
    RULE_markov_config = 7
    RULE_markov_params = 8
    RULE_markov_param = 9
    RULE_query_stmt = 10
    RULE_source = 11
    RULE_where_clause = 12
    RULE_select_clause = 13
    RULE_select_list = 14
    RULE_select_item = 15
    RULE_limit_clause = 16
    RULE_condition = 17
    RULE_comparison = 18
    RULE_comp_op = 19
    RULE_expression = 20
    RULE_bio_seq = 21
    RULE_expr_list = 22
    RULE_function_call = 23
    RULE_arg_list = 24
    RULE_func_name = 25
    RULE_basic_func = 26
    RULE_agg_func = 27
    RULE_literal = 28
    RULE_percentage = 29
    RULE_sequence_literal = 30

    ruleNames =  [ "program", "stmt", "import_stmt", "assignment_stmt", 
                   "print_stmt", "train_markov_stmt", "find_genes_stmt", 
                   "markov_config", "markov_params", "markov_param", "query_stmt", 
                   "source", "where_clause", "select_clause", "select_list", 
                   "select_item", "limit_clause", "condition", "comparison", 
                   "comp_op", "expression", "bio_seq", "expr_list", "function_call", 
                   "arg_list", "func_name", "basic_func", "agg_func", "literal", 
                   "percentage", "sequence_literal" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    T__39=40
    T__40=41
    T__41=42
    T__42=43
    T__43=44
    T__44=45
    T__45=46
    T__46=47
    T__47=48
    T__48=49
    T__49=50
    T__50=51
    T__51=52
    T__52=53
    T__53=54
    T__54=55
    T__55=56
    T__56=57
    T__57=58
    DNA_SEQ=59
    RNA_SEQ=60
    PROTEIN_SEQ=61
    BOOLEAN=62
    NUMBER=63
    STRING=64
    ID=65
    LINE_COMMENT=66
    BLOCK_COMMENT=67
    WS=68

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(biolingoParser.EOF, 0)

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.StmtContext)
            else:
                return self.getTypedRuleContext(biolingoParser.StmtContext,i)


        def getRuleIndex(self):
            return biolingoParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = biolingoParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 62
                self.stmt()
                self.state = 65 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 2097766) != 0) or _la==65):
                    break

            self.state = 67
            self.match(biolingoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def import_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Import_stmtContext,0)


        def assignment_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Assignment_stmtContext,0)


        def query_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Query_stmtContext,0)


        def find_genes_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Find_genes_stmtContext,0)


        def train_markov_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Train_markov_stmtContext,0)


        def print_stmt(self):
            return self.getTypedRuleContext(biolingoParser.Print_stmtContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStmt" ):
                listener.enterStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStmt" ):
                listener.exitStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStmt" ):
                return visitor.visitStmt(self)
            else:
                return visitor.visitChildren(self)




    def stmt(self):

        localctx = biolingoParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stmt)
        try:
            self.state = 76
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.import_stmt()
                pass
            elif token in [65]:
                self.enterOuterAlt(localctx, 2)
                self.state = 70
                self.assignment_stmt()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 3)
                self.state = 71
                self.query_stmt()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 4)
                self.state = 72
                self.find_genes_stmt()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 5)
                self.state = 73
                self.train_markov_stmt()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 6)
                self.state = 74
                self.print_stmt()
                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 7)
                self.state = 75
                self.match(biolingoParser.T__0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Import_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(biolingoParser.STRING, 0)

        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_import_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImport_stmt" ):
                listener.enterImport_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImport_stmt" ):
                listener.exitImport_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImport_stmt" ):
                return visitor.visitImport_stmt(self)
            else:
                return visitor.visitChildren(self)




    def import_stmt(self):

        localctx = biolingoParser.Import_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_import_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(biolingoParser.T__1)
            self.state = 79
            self.match(biolingoParser.STRING)
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==3:
                self.state = 80
                self.match(biolingoParser.T__2)
                self.state = 81
                self.match(biolingoParser.ID)


            self.state = 84
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assignment_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(biolingoParser.ExpressionContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_assignment_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment_stmt" ):
                listener.enterAssignment_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment_stmt" ):
                listener.exitAssignment_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment_stmt" ):
                return visitor.visitAssignment_stmt(self)
            else:
                return visitor.visitChildren(self)




    def assignment_stmt(self):

        localctx = biolingoParser.Assignment_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_assignment_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(biolingoParser.ID)
            self.state = 87
            self.match(biolingoParser.T__3)
            self.state = 88
            self.expression(0)
            self.state = 89
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Print_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(biolingoParser.ExpressionContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_print_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint_stmt" ):
                listener.enterPrint_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint_stmt" ):
                listener.exitPrint_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrint_stmt" ):
                return visitor.visitPrint_stmt(self)
            else:
                return visitor.visitChildren(self)




    def print_stmt(self):

        localctx = biolingoParser.Print_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_print_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 91
            self.match(biolingoParser.T__4)
            self.state = 92
            self.expression(0)
            self.state = 93
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Train_markov_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def source(self):
            return self.getTypedRuleContext(biolingoParser.SourceContext,0)


        def markov_params(self):
            return self.getTypedRuleContext(biolingoParser.Markov_paramsContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_train_markov_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTrain_markov_stmt" ):
                listener.enterTrain_markov_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTrain_markov_stmt" ):
                listener.exitTrain_markov_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTrain_markov_stmt" ):
                return visitor.visitTrain_markov_stmt(self)
            else:
                return visitor.visitChildren(self)




    def train_markov_stmt(self):

        localctx = biolingoParser.Train_markov_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_train_markov_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(biolingoParser.T__5)
            self.state = 96
            self.match(biolingoParser.T__6)
            self.state = 97
            self.source()
            self.state = 100
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==8:
                self.state = 98
                self.match(biolingoParser.T__7)
                self.state = 99
                self.markov_params()


            self.state = 102
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Find_genes_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(biolingoParser.ExpressionContext,0)


        def markov_config(self):
            return self.getTypedRuleContext(biolingoParser.Markov_configContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_find_genes_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFind_genes_stmt" ):
                listener.enterFind_genes_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFind_genes_stmt" ):
                listener.exitFind_genes_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFind_genes_stmt" ):
                return visitor.visitFind_genes_stmt(self)
            else:
                return visitor.visitChildren(self)




    def find_genes_stmt(self):

        localctx = biolingoParser.Find_genes_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_find_genes_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 104
            self.match(biolingoParser.T__8)
            self.state = 105
            self.match(biolingoParser.T__9)
            self.state = 106
            self.expression(0)
            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==11:
                self.state = 107
                self.match(biolingoParser.T__10)
                self.state = 108
                self.markov_config()


            self.state = 111
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Markov_configContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def markov_params(self):
            return self.getTypedRuleContext(biolingoParser.Markov_paramsContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_markov_config

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMarkov_config" ):
                listener.enterMarkov_config(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMarkov_config" ):
                listener.exitMarkov_config(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMarkov_config" ):
                return visitor.visitMarkov_config(self)
            else:
                return visitor.visitChildren(self)




    def markov_config(self):

        localctx = biolingoParser.Markov_configContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_markov_config)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(biolingoParser.T__11)
            self.state = 118
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==13:
                self.state = 114
                self.match(biolingoParser.T__12)
                self.state = 115
                self.markov_params()
                self.state = 116
                self.match(biolingoParser.T__13)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Markov_paramsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def markov_param(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.Markov_paramContext)
            else:
                return self.getTypedRuleContext(biolingoParser.Markov_paramContext,i)


        def getRuleIndex(self):
            return biolingoParser.RULE_markov_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMarkov_params" ):
                listener.enterMarkov_params(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMarkov_params" ):
                listener.exitMarkov_params(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMarkov_params" ):
                return visitor.visitMarkov_params(self)
            else:
                return visitor.visitChildren(self)




    def markov_params(self):

        localctx = biolingoParser.Markov_paramsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_markov_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 120
            self.markov_param()
            self.state = 125
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15:
                self.state = 121
                self.match(biolingoParser.T__14)
                self.state = 122
                self.markov_param()
                self.state = 127
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Markov_paramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(biolingoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(biolingoParser.STRING, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_markov_param

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMarkov_param" ):
                listener.enterMarkov_param(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMarkov_param" ):
                listener.exitMarkov_param(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMarkov_param" ):
                return visitor.visitMarkov_param(self)
            else:
                return visitor.visitChildren(self)




    def markov_param(self):

        localctx = biolingoParser.Markov_paramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_markov_param)
        try:
            self.state = 143
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 128
                self.match(biolingoParser.T__15)
                self.state = 129
                self.match(biolingoParser.T__3)
                self.state = 130
                self.match(biolingoParser.NUMBER)
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 131
                self.match(biolingoParser.T__16)
                self.state = 132
                self.match(biolingoParser.T__3)
                self.state = 133
                self.match(biolingoParser.NUMBER)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 134
                self.match(biolingoParser.T__17)
                self.state = 135
                self.match(biolingoParser.T__3)
                self.state = 136
                self.match(biolingoParser.NUMBER)
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 4)
                self.state = 137
                self.match(biolingoParser.T__18)
                self.state = 138
                self.match(biolingoParser.T__3)
                self.state = 139
                self.match(biolingoParser.STRING)
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 5)
                self.state = 140
                self.match(biolingoParser.T__19)
                self.state = 141
                self.match(biolingoParser.T__3)
                self.state = 142
                self.match(biolingoParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Query_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def source(self):
            return self.getTypedRuleContext(biolingoParser.SourceContext,0)


        def where_clause(self):
            return self.getTypedRuleContext(biolingoParser.Where_clauseContext,0)


        def select_clause(self):
            return self.getTypedRuleContext(biolingoParser.Select_clauseContext,0)


        def limit_clause(self):
            return self.getTypedRuleContext(biolingoParser.Limit_clauseContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_query_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuery_stmt" ):
                listener.enterQuery_stmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuery_stmt" ):
                listener.exitQuery_stmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitQuery_stmt" ):
                return visitor.visitQuery_stmt(self)
            else:
                return visitor.visitChildren(self)




    def query_stmt(self):

        localctx = biolingoParser.Query_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_query_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self.match(biolingoParser.T__20)
            self.state = 146
            self.match(biolingoParser.T__21)
            self.state = 147
            self.match(biolingoParser.T__22)
            self.state = 148
            self.source()
            self.state = 150
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==24:
                self.state = 149
                self.where_clause()


            self.state = 153
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==25:
                self.state = 152
                self.select_clause()


            self.state = 156
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==26:
                self.state = 155
                self.limit_clause()


            self.state = 158
            self.match(biolingoParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SourceContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(biolingoParser.STRING, 0)

        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_source

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSource" ):
                listener.enterSource(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSource" ):
                listener.exitSource(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSource" ):
                return visitor.visitSource(self)
            else:
                return visitor.visitChildren(self)




    def source(self):

        localctx = biolingoParser.SourceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_source)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 160
            _la = self._input.LA(1)
            if not(_la==64 or _la==65):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Where_clauseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition(self):
            return self.getTypedRuleContext(biolingoParser.ConditionContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_where_clause

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhere_clause" ):
                listener.enterWhere_clause(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhere_clause" ):
                listener.exitWhere_clause(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhere_clause" ):
                return visitor.visitWhere_clause(self)
            else:
                return visitor.visitChildren(self)




    def where_clause(self):

        localctx = biolingoParser.Where_clauseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_where_clause)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 162
            self.match(biolingoParser.T__23)
            self.state = 163
            self.condition(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Select_clauseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def select_list(self):
            return self.getTypedRuleContext(biolingoParser.Select_listContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_select_clause

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelect_clause" ):
                listener.enterSelect_clause(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelect_clause" ):
                listener.exitSelect_clause(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelect_clause" ):
                return visitor.visitSelect_clause(self)
            else:
                return visitor.visitChildren(self)




    def select_clause(self):

        localctx = biolingoParser.Select_clauseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_select_clause)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165
            self.match(biolingoParser.T__24)
            self.state = 166
            self.select_list()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Select_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def select_item(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.Select_itemContext)
            else:
                return self.getTypedRuleContext(biolingoParser.Select_itemContext,i)


        def getRuleIndex(self):
            return biolingoParser.RULE_select_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelect_list" ):
                listener.enterSelect_list(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelect_list" ):
                listener.exitSelect_list(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelect_list" ):
                return visitor.visitSelect_list(self)
            else:
                return visitor.visitChildren(self)




    def select_list(self):

        localctx = biolingoParser.Select_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_select_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 168
            self.select_item()
            self.state = 173
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15:
                self.state = 169
                self.match(biolingoParser.T__14)
                self.state = 170
                self.select_item()
                self.state = 175
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Select_itemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(biolingoParser.ExpressionContext,0)


        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_select_item

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelect_item" ):
                listener.enterSelect_item(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelect_item" ):
                listener.exitSelect_item(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelect_item" ):
                return visitor.visitSelect_item(self)
            else:
                return visitor.visitChildren(self)




    def select_item(self):

        localctx = biolingoParser.Select_itemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_select_item)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            self.expression(0)
            self.state = 179
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==3:
                self.state = 177
                self.match(biolingoParser.T__2)
                self.state = 178
                self.match(biolingoParser.ID)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Limit_clauseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(biolingoParser.NUMBER, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_limit_clause

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLimit_clause" ):
                listener.enterLimit_clause(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLimit_clause" ):
                listener.exitLimit_clause(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLimit_clause" ):
                return visitor.visitLimit_clause(self)
            else:
                return visitor.visitChildren(self)




    def limit_clause(self):

        localctx = biolingoParser.Limit_clauseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_limit_clause)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 181
            self.match(biolingoParser.T__25)
            self.state = 182
            self.match(biolingoParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condition(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.ConditionContext)
            else:
                return self.getTypedRuleContext(biolingoParser.ConditionContext,i)


        def comparison(self):
            return self.getTypedRuleContext(biolingoParser.ComparisonContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)



    def condition(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = biolingoParser.ConditionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 34
        self.enterRecursionRule(localctx, 34, self.RULE_condition, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 192
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 185
                self.match(biolingoParser.T__28)
                self.state = 186
                self.condition(3)
                pass

            elif la_ == 2:
                self.state = 187
                self.match(biolingoParser.T__12)
                self.state = 188
                self.condition(0)
                self.state = 189
                self.match(biolingoParser.T__13)
                pass

            elif la_ == 3:
                self.state = 191
                self.comparison()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 202
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,15,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 200
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
                    if la_ == 1:
                        localctx = biolingoParser.ConditionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_condition)
                        self.state = 194
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 195
                        self.match(biolingoParser.T__26)
                        self.state = 196
                        self.condition(6)
                        pass

                    elif la_ == 2:
                        localctx = biolingoParser.ConditionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_condition)
                        self.state = 197
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 198
                        self.match(biolingoParser.T__27)
                        self.state = 199
                        self.condition(5)
                        pass

             
                self.state = 204
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,15,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ComparisonContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(biolingoParser.ExpressionContext,i)


        def comp_op(self):
            return self.getTypedRuleContext(biolingoParser.Comp_opContext,0)


        def expr_list(self):
            return self.getTypedRuleContext(biolingoParser.Expr_listContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_comparison

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparison" ):
                listener.enterComparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparison" ):
                listener.exitComparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparison" ):
                return visitor.visitComparison(self)
            else:
                return visitor.visitChildren(self)




    def comparison(self):

        localctx = biolingoParser.ComparisonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_comparison)
        try:
            self.state = 225
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 205
                self.expression(0)
                self.state = 206
                self.comp_op()
                self.state = 207
                self.expression(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 209
                self.expression(0)
                self.state = 210
                self.match(biolingoParser.T__29)
                self.state = 211
                self.expression(0)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 213
                self.expression(0)
                self.state = 214
                self.match(biolingoParser.T__30)
                self.state = 215
                self.expression(0)
                self.state = 216
                self.match(biolingoParser.T__26)
                self.state = 217
                self.expression(0)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 219
                self.expression(0)
                self.state = 220
                self.match(biolingoParser.T__9)
                self.state = 221
                self.match(biolingoParser.T__12)
                self.state = 222
                self.expr_list()
                self.state = 223
                self.match(biolingoParser.T__13)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comp_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return biolingoParser.RULE_comp_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComp_op" ):
                listener.enterComp_op(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComp_op" ):
                listener.exitComp_op(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComp_op" ):
                return visitor.visitComp_op(self)
            else:
                return visitor.visitChildren(self)




    def comp_op(self):

        localctx = biolingoParser.Comp_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_comp_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 227
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 133143986192) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(biolingoParser.ExpressionContext,i)


        def function_call(self):
            return self.getTypedRuleContext(biolingoParser.Function_callContext,0)


        def literal(self):
            return self.getTypedRuleContext(biolingoParser.LiteralContext,0)


        def bio_seq(self):
            return self.getTypedRuleContext(biolingoParser.Bio_seqContext,0)


        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = biolingoParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 40
        self.enterRecursionRule(localctx, 40, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 246
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 230
                self.match(biolingoParser.T__42)
                self.state = 231
                self.expression(9)
                pass

            elif la_ == 2:
                self.state = 232
                self.match(biolingoParser.T__43)
                self.state = 233
                self.expression(8)
                pass

            elif la_ == 3:
                self.state = 234
                self.match(biolingoParser.T__44)
                self.state = 235
                self.expression(7)
                pass

            elif la_ == 4:
                self.state = 236
                self.match(biolingoParser.T__40)
                self.state = 237
                self.expression(6)
                pass

            elif la_ == 5:
                self.state = 238
                self.match(biolingoParser.T__12)
                self.state = 239
                self.expression(0)
                self.state = 240
                self.match(biolingoParser.T__13)
                pass

            elif la_ == 6:
                self.state = 242
                self.function_call()
                pass

            elif la_ == 7:
                self.state = 243
                self.literal()
                pass

            elif la_ == 8:
                self.state = 244
                self.bio_seq()
                pass

            elif la_ == 9:
                self.state = 245
                self.match(biolingoParser.ID)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 259
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 257
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                    if la_ == 1:
                        localctx = biolingoParser.ExpressionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 248
                        if not self.precpred(self._ctx, 12):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 12)")
                        self.state = 249
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 962072674304) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 250
                        self.expression(13)
                        pass

                    elif la_ == 2:
                        localctx = biolingoParser.ExpressionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 251
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 252
                        _la = self._input.LA(1)
                        if not(_la==40 or _la==41):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 253
                        self.expression(12)
                        pass

                    elif la_ == 3:
                        localctx = biolingoParser.ExpressionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 254
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 255
                        self.match(biolingoParser.T__41)
                        self.state = 256
                        self.match(biolingoParser.ID)
                        pass

             
                self.state = 261
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Bio_seqContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(biolingoParser.STRING, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_bio_seq

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBio_seq" ):
                listener.enterBio_seq(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBio_seq" ):
                listener.exitBio_seq(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBio_seq" ):
                return visitor.visitBio_seq(self)
            else:
                return visitor.visitChildren(self)




    def bio_seq(self):

        localctx = biolingoParser.Bio_seqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_bio_seq)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 262
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 492581209243648) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 263
            self.match(biolingoParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expr_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(biolingoParser.ExpressionContext,i)


        def getRuleIndex(self):
            return biolingoParser.RULE_expr_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_list" ):
                listener.enterExpr_list(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_list" ):
                listener.exitExpr_list(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr_list" ):
                return visitor.visitExpr_list(self)
            else:
                return visitor.visitChildren(self)




    def expr_list(self):

        localctx = biolingoParser.Expr_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_expr_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self.expression(0)
            self.state = 270
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15:
                self.state = 266
                self.match(biolingoParser.T__14)
                self.state = 267
                self.expression(0)
                self.state = 272
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def func_name(self):
            return self.getTypedRuleContext(biolingoParser.Func_nameContext,0)


        def arg_list(self):
            return self.getTypedRuleContext(biolingoParser.Arg_listContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_function_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_call" ):
                listener.enterFunction_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_call" ):
                listener.exitFunction_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_call" ):
                return visitor.visitFunction_call(self)
            else:
                return visitor.visitChildren(self)




    def function_call(self):

        localctx = biolingoParser.Function_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_function_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.func_name()
            self.state = 274
            self.match(biolingoParser.T__12)
            self.state = 276
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if ((((_la - 13)) & ~0x3f) == 0 and ((1 << (_la - 13)) & 9007198449434625) != 0):
                self.state = 275
                self.arg_list()


            self.state = 278
            self.match(biolingoParser.T__13)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Arg_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(biolingoParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(biolingoParser.ExpressionContext,i)


        def getRuleIndex(self):
            return biolingoParser.RULE_arg_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArg_list" ):
                listener.enterArg_list(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArg_list" ):
                listener.exitArg_list(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArg_list" ):
                return visitor.visitArg_list(self)
            else:
                return visitor.visitChildren(self)




    def arg_list(self):

        localctx = biolingoParser.Arg_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_arg_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 280
            self.expression(0)
            self.state = 285
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==15:
                self.state = 281
                self.match(biolingoParser.T__14)
                self.state = 282
                self.expression(0)
                self.state = 287
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Func_nameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def basic_func(self):
            return self.getTypedRuleContext(biolingoParser.Basic_funcContext,0)


        def agg_func(self):
            return self.getTypedRuleContext(biolingoParser.Agg_funcContext,0)


        def ID(self):
            return self.getToken(biolingoParser.ID, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_func_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunc_name" ):
                listener.enterFunc_name(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunc_name" ):
                listener.exitFunc_name(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunc_name" ):
                return visitor.visitFunc_name(self)
            else:
                return visitor.visitChildren(self)




    def func_name(self):

        localctx = biolingoParser.Func_nameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_func_name)
        try:
            self.state = 291
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [49, 50, 51, 52, 53]:
                self.enterOuterAlt(localctx, 1)
                self.state = 288
                self.basic_func()
                pass
            elif token in [54, 55, 56, 57, 58]:
                self.enterOuterAlt(localctx, 2)
                self.state = 289
                self.agg_func()
                pass
            elif token in [65]:
                self.enterOuterAlt(localctx, 3)
                self.state = 290
                self.match(biolingoParser.ID)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Basic_funcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return biolingoParser.RULE_basic_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBasic_func" ):
                listener.enterBasic_func(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBasic_func" ):
                listener.exitBasic_func(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBasic_func" ):
                return visitor.visitBasic_func(self)
            else:
                return visitor.visitChildren(self)




    def basic_func(self):

        localctx = biolingoParser.Basic_funcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_basic_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 293
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 17451448556060672) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Agg_funcContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return biolingoParser.RULE_agg_func

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAgg_func" ):
                listener.enterAgg_func(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAgg_func" ):
                listener.exitAgg_func(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAgg_func" ):
                return visitor.visitAgg_func(self)
            else:
                return visitor.visitChildren(self)




    def agg_func(self):

        localctx = biolingoParser.Agg_funcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_agg_func)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 295
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 558446353793941504) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(biolingoParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(biolingoParser.STRING, 0)

        def BOOLEAN(self):
            return self.getToken(biolingoParser.BOOLEAN, 0)

        def percentage(self):
            return self.getTypedRuleContext(biolingoParser.PercentageContext,0)


        def sequence_literal(self):
            return self.getTypedRuleContext(biolingoParser.Sequence_literalContext,0)


        def getRuleIndex(self):
            return biolingoParser.RULE_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLiteral" ):
                listener.enterLiteral(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLiteral" ):
                listener.exitLiteral(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = biolingoParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_literal)
        try:
            self.state = 302
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 297
                self.match(biolingoParser.NUMBER)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 298
                self.match(biolingoParser.STRING)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 299
                self.match(biolingoParser.BOOLEAN)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 300
                self.percentage()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 301
                self.sequence_literal()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PercentageContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(biolingoParser.NUMBER, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_percentage

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPercentage" ):
                listener.enterPercentage(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPercentage" ):
                listener.exitPercentage(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPercentage" ):
                return visitor.visitPercentage(self)
            else:
                return visitor.visitChildren(self)




    def percentage(self):

        localctx = biolingoParser.PercentageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_percentage)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 304
            self.match(biolingoParser.NUMBER)
            self.state = 305
            self.match(biolingoParser.T__38)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Sequence_literalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DNA_SEQ(self):
            return self.getToken(biolingoParser.DNA_SEQ, 0)

        def RNA_SEQ(self):
            return self.getToken(biolingoParser.RNA_SEQ, 0)

        def PROTEIN_SEQ(self):
            return self.getToken(biolingoParser.PROTEIN_SEQ, 0)

        def getRuleIndex(self):
            return biolingoParser.RULE_sequence_literal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSequence_literal" ):
                listener.enterSequence_literal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSequence_literal" ):
                listener.exitSequence_literal(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSequence_literal" ):
                return visitor.visitSequence_literal(self)
            else:
                return visitor.visitChildren(self)




    def sequence_literal(self):

        localctx = biolingoParser.Sequence_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_sequence_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 307
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4035225266123964416) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[17] = self.condition_sempred
        self._predicates[20] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def condition_sempred(self, localctx:ConditionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 4)
         

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 2:
                return self.precpred(self._ctx, 12)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 10)
         




