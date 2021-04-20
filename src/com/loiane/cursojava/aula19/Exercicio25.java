package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um número na posição " + (i +1));
            vetorA[i] = scanner.nextInt();
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
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
    }
}
