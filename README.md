# TP1-Compiladores


# Biolingo - Funciones y Casos de Prueba

## 1. Funciones del Proyecto

### 1.1 Funciones Biológicas Básicas
| Función       | Sintaxis               | Descripción                           | Entrada           | Salida                  |
|---------------|----------------------|---------------------------------------|-----------------|-----------------------|
| length        | length(sequence)      | Calcula la longitud de una secuencia  | DNA/RNA/PROTEIN | Número entero          |
| gc_content    | gc_content(sequence)  | Calcula el porcentaje de G y C        | DNA/RNA         | Porcentaje (0-100%)    |
| complement    | complement(sequence)  | Genera el complemento de bases         | DNA/RNA         | Secuencia complementaria|
| reverse       | reverse(sequence)     | Invierte el orden de la secuencia     | DNA/RNA/PROTEIN | Secuencia invertida    |
| translate     | translate(sequence)   | Traduce DNA a proteína                 | DNA (múltiplo de 3) | PROTEIN             |

**Ejemplos:**
```bioling
seq = DNA "ATGCGTACGT";
length(seq);        -- Retorna: 10
gc_content(seq);    -- Retorna: 60.0%
complement(seq);    -- Retorna: DNA "TACGCATGCA"
reverse(seq);       -- Retorna: DNA "TGCATGCGTA"
translate(seq);     -- Retorna: PROTEIN "MRT"
```

### 1.2. Operadores Nativos de Secuencias (3)
| Operador            | Sintaxis | Descripción           | Equivalente              |
| ------------------- | -------- | --------------------- | ------------------------ |
| Complemento         | ~seq     | Complemento de bases  | complement(seq)          |
| Reversa             | <-seq    | Invertir secuencia    | reverse(seq)             |
| Complemento Reverso | ~<-seq   | Comp. reverso (5'→3') | complement(reverse(seq)) |


### 1.3. Tipos de Datos Nativos
| Tipo    | Sintaxis      | Bases Válidas      | Ejemplo           |
| ------- | ------------- | ------------------ | ----------------- |
| DNA     | DNA "..."     | A, T, C, G, N      | DNA "ATGCGTACGT"  |
| RNA     | RNA "..."     | A, U, C, G, N      | RNA "AUGCGUACGU"  |
| PROTEIN | PROTEIN "..." | 20 aminoácidos + * | PROTEIN "MKLVST*" |

### 1.4. Comandos de Cadenas de Markov
```bioling
TRAIN_MARKOV ON "training_genes.fasta";
TRAIN_MARKOV ON "annotated_genome.fasta" WITH (
    order=2,          -- Orden del modelo (1, 2, 3)
    window=100        -- Tamaño de ventana de análisis
);
```

Parámetros:
order: Orden del modelo de Markov (1=primera orden, 2=segunda orden)
window: Tamaño de ventana para calcular probabilidades locales
```bioling
FIND_GENES IN genome;
FIND_GENES IN genome USING markov(
    order=2,          
    threshold=0.7,    
    min_length=300    
);
```

Parámetros:
order: Orden del modelo de Markov
threshold: Umbral de probabilidad (0.0-1.0)
min_length: Longitud mínima en nucleótidos

### 1.5. Consultas (FIND)
```bioling
FIND_GENES IN genome;
FIND_GENES IN genome USING markov(
    order=2,          
    threshold=0.7,    
    min_length=300    
);
```
Parámetros:
order: Orden del modelo de Markov
threshold: Umbral de probabilidad (0.0-1.0)
min_length: Longitud mínima en nucleótidos


### 1.6. Funciones de Agregación
| Función    | Descripción      |
| ---------- | ---------------- |
| COUNT(...) | Cuenta elementos |
| AVG(...)   | Promedio         |
| MIN(...)   | Valor mínimo     |
| MAX(...)   | Valor máximo     |
| SUM(...)   | Suma total       |


### 1.7. Comandos Auxiliares
```bioling
IMPORT "archivo.fasta" AS nombre;    -- Importar archivo
variable = expresion;                 -- Asignar variable
PRINT expresion;                      -- Mostrar en consola
```

### Ejecutar con los siguientes comandos:
```bioling
java -jar lib/antlr-4.13.2-complete.jar -o gen grammar/biolingo.g4

javac -d build -cp .:lib/antlr-4.13.2-complete.jar gen/grammar/*.java

java -cp build:lib/antlr-4.13.2-complete.jar org.antlr.v4.gui.TestRig biolingo program -tokens input/input.txt
```