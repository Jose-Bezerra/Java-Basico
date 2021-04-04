package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetorA na posição: " + i);
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do vetorB na posição: " + i);
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Entre com o valor na posição: " + i);
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        System.out.print("vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }

}

