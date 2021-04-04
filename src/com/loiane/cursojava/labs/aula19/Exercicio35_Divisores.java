package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio35_Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor no vetor A - " + i);
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o número " + vetorA[i]);
            for (int j = 1; j < vetorA.length; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j + " é divisor!");
                }
            }

            System.out.println();
        }





    }
}
