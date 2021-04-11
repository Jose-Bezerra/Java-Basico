package com.loiane.cursojava.aulas.labs.aula19;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor na posição: " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("vetorB = " + vetorB);
        System.out.println("vetorA = " + vetorA);

        System.out.print("Vetor A = ");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
        System.out.println();
        System.out.print("Vetor B = ");
        for (int valor: vetorB) {
            System.out.print(valor + " ");
        }

    }

}

