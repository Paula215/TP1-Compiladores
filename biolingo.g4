grammar biolingo;

// ===== PROGRAMA =====
program: stmt+ EOF ;

// ===== STATEMENTS =====
stmt
    : import_stmt
    | assignment_stmt
    | query_stmt
    | find_genes_stmt
    | train_markov_stmt
    | print_stmt
    | ';'  // statement vacío
    ;

import_stmt
    : 'IMPORT' STRING ('AS' ID)? ';'
    ;

assignment_stmt
    : ID '=' expression ';'
    ;

print_stmt
    : 'PRINT' expression ';'
    ;

// ===== TRAIN MARKOV =====
train_markov_stmt
    : 'TRAIN_MARKOV' 'ON' source ('WITH' markov_params)? ';'
    ;

// ===== FIND GENES =====
find_genes_stmt
    : 'FIND_GENES' 'IN' expression ('USING' markov_config)? ';'
    ;

markov_config
    : 'markov' ('(' markov_params ')')?
    ;

markov_params
    : markov_param (',' markov_param)*
    ;

markov_param
    : 'order' '=' NUMBER
    | 'threshold' '=' NUMBER
    | 'min_length' '=' NUMBER
    | 'model' '=' STRING
    | 'window' '=' NUMBER
    ;

// ===== QUERY STATEMENTS =====
query_stmt
    : 'FIND' 'sequences' 'FROM' source where_clause? select_clause? limit_clause? ';'
    ;

source
    : STRING
    | ID
    ;

where_clause
    : 'WHERE' condition
    ;

select_clause
    : 'SELECT' select_list
    ;

select_list
    : select_item (',' select_item)*
    ;

select_item
    : expression ('AS' ID)?
    ;

limit_clause
    : 'LIMIT' NUMBER
    ;

// ===== CONDITIONS =====
condition
    : 'NOT' condition
    | '(' condition ')'
    | comparison
    | condition 'AND' condition
    | condition 'OR' condition
    ;

comparison
    : expression comp_op expression
    | expression 'CONTAINS' expression
    | expression 'BETWEEN' expression 'AND' expression
    | expression 'IN' '(' expr_list ')'
    ;

comp_op
    : '='
    | '!='
    | '<'
    | '<='
    | '>'
    | '>='
    ;

// ===== EXPRESIONES CON ETIQUETAS =====
expression
    : '~' expression                              # UnaryComplement
    | '<-' expression                             # UnaryReverse
    | '~<-' expression                            # UnaryRevComplement
    | '-' expression                              # UnaryMinus
    | '(' expression ')'                          # Group
    | function_call                               # FuncCall
    | literal                                     # LiteralExpr
    | bio_seq                                     # BioSeqExpr
    | ID                                          # IdExpr
    | expression op=('*'|'/'|'%') expression      # MulDivMod
    | expression op=('+'|'-') expression          # AddSub
    | expression '.' ID                           # FieldAccess
    ;

// ===== SECUENCIAS BIOLÓGICAS =====
bio_seq
    : ('DNA' | 'RNA' | 'PROTEIN') STRING
    ;

// ===== LISTAS DE EXPRESIONES =====
expr_list
    : expression (',' expression)*
    ;

// ===== LLAMADAS A FUNCIONES =====
function_call
    : func_name '(' arg_list? ')'
    ;

arg_list
    : expression (',' expression)*
    ;

func_name
    : basic_func
    | agg_func
    | ID
    ;

basic_func
    : 'length'
    | 'gc_content'
    | 'complement'
    | 'reverse'
    | 'translate'
    ;

agg_func
    : 'COUNT'
    | 'AVG'
    | 'MIN'
    | 'MAX'
    | 'SUM'
    ;

// ===== LITERALES =====
literal
    : NUMBER
    | STRING
    | BOOLEAN
    | percentage
    | sequence_literal
    ;

percentage
    : NUMBER '%'
    ;

sequence_literal
    : DNA_LITERAL
    | RNA_LITERAL
    | PROTEIN_LITERAL
    ;

// ===== TOKENS =====
DNA_LITERAL: 'DNA' '"' [ATGCatgc]+ '"' ;
RNA_LITERAL: 'RNA' '"' [AUGCaugc]+ '"' ;
PROTEIN_LITERAL: 'PROTEIN' '"' [A-Z*]+ '"' ;

BOOLEAN: 'true' | 'false' ;
NUMBER: [0-9]+ ('.' [0-9]+)? ;
STRING: '"' (~["\r\n])* '"' ;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;

LINE_COMMENT: '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
WS: [ \t\r\n]+ -> skip ;