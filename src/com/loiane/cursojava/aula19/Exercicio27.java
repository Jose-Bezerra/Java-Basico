package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[1];
       char [] vetorB = new char[vetorA.length];

        System.out.println("Entre com os valores do Vetor A na posição: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i + 1) + ") ");
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] < 7) {
                vetorB[i] = '\u0061';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else {
                vetorB[i] = 'e';
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


    }
}
