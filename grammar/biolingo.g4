grammar biolingo;

// ============================================================================
// PROGRAMA
// ============================================================================

program: statement+ EOF;

statement: import_stmt
         | assignment_stmt
         | query_stmt
         | ';'
         ;

// ============================================================================
// IMPORTS Y ASIGNACIONES
// ============================================================================

import_stmt: 'IMPORT' STRING ('AS' ID)? ';';
assignment_stmt: ID '=' expression ';';

// ============================================================================
// SECUENCIAS (literales nativos)
// ============================================================================

sequence_literal: DNA_SEQ | RNA_SEQ | PROTEIN_SEQ;

DNA_SEQ: 'DNA' '"' [ATCGN]+ '"';
RNA_SEQ: 'RNA' '"' [AUCGN]+ '"';
PROTEIN_SEQ: 'PROTEIN' '"' [ACDEFGHIKLMNPQRSTVWY*]+ '"';

// ============================================================================
// CONSULTAS
// ============================================================================

query_stmt: 'FIND' target 
            'FROM' source 
            where_clause? 
            select_clause?
            limit_clause? 
            ';';

target: 'sequences' | 'genes' | 'proteins';
source: STRING | ID;

where_clause: 'WHERE' condition;
select_clause: 'SELECT' select_list;
select_list: select_item (',' select_item)*;
select_item: expression ('AS' ID)?;
limit_clause: 'LIMIT' NUMBER;

// ============================================================================
// CONDICIONES Y EXPRESIONES
// ============================================================================

condition: condition 'AND' condition
         | condition 'OR' condition
         | 'NOT' condition
         | '(' condition ')'
         | comparison
         ;

comparison: expression comp_op expression
          | expression 'CONTAINS' expression
          | expression 'MATCHES' STRING
          ;

comp_op: '=' | '!=' | '<' | '<=' | '>' | '>=';

// ============================================================================
// EXPRESIONES
// ============================================================================

expression: expression '=>' seq_type
          | expression ('*' | '/' | '%') expression
          | expression ('+' | '-') expression
          | expression '.' ID
          | '-' expression
          | '(' expression ')'
          | function_call
          | literal
          | ID
          ;

seq_type: 'DNA' | 'RNA' | 'PROTEIN';
expr_list: expression (',' expression)*;

// ============================================================================
// FUNCIONES BIOLÓGICAS (core)
// ============================================================================

function_call: func_name '(' arg_list? ')';
arg_list: expression (',' expression)*;

func_name: bio_func | agg_func | ID;

bio_func: 'length'
        | 'gc_content'
        | 'complement'
        | 'reverse_complement'
        | 'translate'
        | 'transcribe'
        | 'reverse'
        | 'molecular_weight'
        | 'melting_temp'
        ;

agg_func: 'COUNT' | 'AVG' | 'MIN' | 'MAX' | 'SUM';

// ============================================================================
// LITERALES Y TOKENS
// ============================================================================

literal: NUMBER
       | STRING
       | BOOLEAN
       | percentage
       | sequence_literal
       ;

percentage: NUMBER '%';
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' (~["\\\r\n] | '\\' .)* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Comentarios y espacios
COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;
