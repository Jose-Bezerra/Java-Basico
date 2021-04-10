package com.loiane.cursojava.labs.aula20;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] inteiros = new int[3][3];

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.print("Entre com o valor da posição [" + i + "," + j + "]: ");
                inteiros[i][j] = scanner.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
               if (inteiros[i][j] % 2 == 0) {
                   qtdPares++;
               } else {
                   qtdImpares++;
               }
            }
        }

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.print(inteiros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpares);
    }
}
