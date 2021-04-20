package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor na posição " + (i+1) + " do vetorA");
            vetorA[i] = scanner.nextInt();
            System.out.println("Entre com o valor na posição " + (i+1) + " do vetorB");
            vetorB[i] = scanner.nextInt();

            //Regra para os valores do vetorC
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }

        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }
}
