package com.loiane.cursojava.labs.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor na posição: " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("vetorB = " + vetorB);
        System.out.println("vetorA = " + vetorA);

        System.out.print("Vetor A = ");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }
        System.out.println();
        DecimalFormat df = new DecimalFormat("##,##.##");
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }

    }

}

