package com.loiane.cursojava.labs.aula19;

public class Exercicio22 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        // 10 - 100%
        // qtd - x
        // x = (qtd * 100) / 10

        double porcQtd0 = (qtd0 * 100) / vetorA.length;
        double porcQtd1 = 100 - porcQtd0 ;

        System.out.print("vetorA = " );
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.println("Porc0 = " + porcQtd0);
        System.out.println("Porc1 = " + porcQtd1);

        System.out.println();
    }
}
