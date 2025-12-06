grammar biolingo;

// PROGRAMA PRINCIPAL
program: stmt+ EOF;

stmt: import_stmt
     | assignment_stmt
     | query_stmt
     | find_genes_stmt
     | train_markov_stmt
     | print_stmt
     | ';'
     ;

// IMPORTS
import_stmt: 'IMPORT' STRING ('AS' ID)? ';';

// ASIGNACIONES
assignment_stmt: ID '=' expression ';';

// PRINT
print_stmt: 'PRINT' expression ';';

// CADENAS DE MARKOV - COMANDOS PRINCIPALES
train_markov_stmt: 'TRAIN_MARKOV' 'ON' source 
                   ('WITH' markov_params)?
                   ';';

find_genes_stmt: 'FIND_GENES' 'IN' expression 
                 ('USING' markov_config)?
                 ';';

markov_config: 'markov' ('(' markov_params ')')?;

markov_params: markov_param (',' markov_param)*;

markov_param: 'order' '=' NUMBER
            | 'threshold' '=' NUMBER
            | 'min_length' '=' NUMBER
            | 'model' '=' STRING
            | 'window' '=' NUMBER
            ;

// CONSULTAS BÁSICAS (FIND)
query_stmt: 'FIND' 'sequences' 
            'FROM' source 
            where_clause? 
            select_clause?
            limit_clause? 
            ';';

source: STRING | ID;

where_clause: 'WHERE' condition;

select_clause: 'SELECT' select_list;

select_list: select_item (',' select_item)*;

select_item: expression ('AS' ID)?;

limit_clause: 'LIMIT' NUMBER;

// CONDICIONES (WHERE)
condition: condition 'AND' condition
         | condition 'OR' condition
         | 'NOT' condition
         | '(' condition ')'
         | comparison
         ;

comparison: expression comp_op expression
          | expression 'CONTAINS' expression
          | expression 'BETWEEN' expression 'AND' expression
          | expression 'IN' '(' expr_list ')'
          ;

comp_op: '=' | '!=' | '<' | '<=' | '>' | '>=';

// EXPRESIONES (CORREGIDA - sin ambigüedades)
expression: 
      expression '.' ID                          // Acceso a campo PRIMERO (más alta precedencia)
    | expression ('*' | '/' | '%') expression    // Multiplicación
    | expression ('+' | '-') expression          // Suma/Resta  
    | '~' expression                             // Complemento
    | '<-' expression                            // Reversa
    | '~<-' expression                           // Complemento reverso
    | '-' expression                             // Negación unaria
    | '(' expression ')'                         // Agrupación
    | function_call                              // Llamada a función
    | literal                                    // Literales
    | bio_seq                                    // Secuencias biológicas
    | ID                                         // Identificadores
    ;
          
bio_seq: ('DNA' | 'RNA' | 'PROTEIN') STRING;

expr_list: expression (',' expression)*;

// FUNCIONES
function_call: func_name '(' arg_list? ')';

arg_list: expression (',' expression)*;

func_name: basic_func 
         | agg_func 
         | ID                    
         ;

// Funciones biológicas básicas
basic_func: 'length'
          | 'gc_content'
          | 'complement' 
          | 'reverse'
          | 'translate'
          ;

// Funciones de agregación
agg_func: 'COUNT' 
        | 'AVG' 
        | 'MIN' 
        | 'MAX' 
        | 'SUM'
        ;

// LITERALES
literal: NUMBER
       | STRING
       | BOOLEAN
       | percentage
       | sequence_literal
       ;

percentage: NUMBER '%';

// Secuencias tipadas (CORREGIDO - sin conflicto con bio_seq)
sequence_literal: DNA_LITERAL | RNA_LITERAL | PROTEIN_LITERAL;

DNA_LITERAL: 'dna' '"' [ATCGN]+ '"';
RNA_LITERAL: 'rna' '"' [AUCGN]+ '"';
PROTEIN_LITERAL: 'protein' '"' [ACDEFGHIKLMNPQRSTVWY*]+ '"';

// TOKENS BÁSICOS
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';

NUMBER: [0-9]+ ('.' [0-9]+)?;

STRING: '"' (~["\\\r\n] | '\\' .)* '"';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

// COMENTARIOS Y ESPACIOS
LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;