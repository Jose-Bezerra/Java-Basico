package com.loiane.cursojava.labs.aula20;

import java.util.Random;

public class Exerc02 {
    public static void main(String[] args) {
        int[][] numAleatorios = new int[10][10];
        Random numRandom = new Random();
        int maiorLinha5 = 0;
        int menorLinha5 = Integer.MAX_VALUE;
        int maiorColuna7 = 0;
        int menorColuna7 = Integer.MAX_VALUE;
        int linha5 = 5;
        int coluna7 = 7;

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(100);
                System.out.printf("%d ", numAleatorios[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < numAleatorios[linha5].length; i++) {
            if (numAleatorios[linha5][i] > maiorLinha5) {
                maiorLinha5 = numAleatorios[linha5][i];
            }

            if (numAleatorios[linha5][i] < menorLinha5) {
                menorLinha5 = numAleatorios[linha5][i];
            }
        }

        for (int i = 0; i < numAleatorios.length; i++) {
            if (numAleatorios[i][coluna7] > maiorColuna7) {
                maiorColuna7 = numAleatorios[i][coluna7];
            }

            if (numAleatorios[i][coluna7] < menorColuna7) {
                menorColuna7 = numAleatorios[i][coluna7];
            }
        }

        System.out.println("Maior Linha 5: " + maiorLinha5);
        System.out.println("Menor Linha 5: " + menorLinha5);
        System.out.println("Maior Linha 7: " + maiorColuna7);
        System.out.println("Menor Linha 7: " + menorColuna7);
    }
}
