package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[1];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor no vetor A - " + i);
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada de " +  vetorA[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(vetorA[i] + " * " + j  +  " = " + (vetorA[i] * j));
            }

            System.out.println();
        }




    }
}
