# TP1-Compiladores

Ejecutar con los siguientes comandos:


java -jar lib/antlr-4.13.2-complete.jar -o gen grammar/biolingo.g4

javac -d build -cp .:lib/antlr-4.13.2-complete.jar gen/grammar/*.java

java -cp build:lib/antlr-4.13.2-complete.jar org.antlr.v4.gui.TestRig biolingo program -tokens input/input.txt
