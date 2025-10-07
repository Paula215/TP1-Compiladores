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
// Entrenar modelo de Markov con secuencias anotadas
train_markov_stmt: 'TRAIN_MARKOV' 'ON' source 
                   ('WITH' markov_params)?
                   ';';

// Encontrar genes usando el modelo de Markov
find_genes_stmt: 'FIND_GENES' 'IN' expression 
                 ('USING' markov_config)?
                 ';';

markov_config: 'markov' ('(' markov_params ')')?;

markov_params: markov_param (',' markov_param)*;

markov_param: 'order' '=' NUMBER              // Orden del modelo (1, 2, 3)
            | 'threshold' '=' NUMBER          // Umbral de probabilidad
            | 'min_length' '=' NUMBER         // Longitud mínima de gen
            | 'model' '=' STRING              // Archivo de modelo pre-entrenado
            | 'window' '=' NUMBER             // Tamaño de ventana para análisis
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

// EXPRESIONES (con precedencia correcta)
expression: expression ('*' | '/' | '%') expression    // Multiplicación, división
          | expression ('+' | '-') expression          // Suma, resta
          | expression '.' ID                          // Acceso a campo (gene.length)
          | '~' expression                             // Complemento
          | '<-' expression                            // Reversa
          | '~<-' expression                           // Complemento reverso
          | '-' expression                             // Negación aritmética
          | '(' expression ')'                         // Agrupación
          | function_call                              // Llamada a función
          | literal                                    // Literales
          | ID                                         // Identificadores
          ;

expr_list: expression (',' expression)*;

// FUNCIONES (Solo 5 básicas)
function_call: func_name '(' arg_list? ')';

arg_list: expression (',' expression)*;

func_name: basic_func 
         | agg_func 
         | ID                    
         ;

// Funciones biológicas básicas
basic_func: 'length'             // Longitud de secuencia
          | 'gc_content'         // Contenido GC (%)
          | 'complement'         // Complemento de DNA/RNA
          | 'reverse'            // Reversa de secuencia
          | 'translate'          // DNA -> Proteína
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

// Secuencias tipadas
sequence_literal: DNA_SEQ | RNA_SEQ | PROTEIN_SEQ;

DNA_SEQ: 'DNA' '"' [ATCGN]+ '"';
RNA_SEQ: 'RNA' '"' [AUCGN]+ '"';
PROTEIN_SEQ: 'PROTEIN' '"' [ACDEFGHIKLMNPQRSTVWY*]+ '"';

// TOKENS BÁSICOS
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';

NUMBER: [0-9]+ ('.' [0-9]+)?;

STRING: '"' (~["\\\r\n] | '\\' .)* '"';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

// COMENTARIOS Y ESPACIOS
LINE_COMMENT: '--' ~[\r\n]* -> skip;

BLOCK_COMMENT: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;