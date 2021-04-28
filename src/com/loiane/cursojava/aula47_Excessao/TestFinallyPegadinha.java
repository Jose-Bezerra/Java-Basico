package com.loiane.cursojava.aula47_Excessao;

public class TestFinallyPegadinha {
    public static void main(String[] args) {
        int[] numeros = {4, 8 , 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " +  (numeros[i]/denominadores[i]));
            }
            catch (ArithmeticException  e) {
                System.out.println("Erro ao dividir por 0");
                System.exit(0);
            }
            catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println("Ocorreu um erro.");
                System.exit(0);
            }
            finally {
                System.out.println("Linha impressa depois do try ou catch.");
                System.out.println();
            }
        }
    }
}
