package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetorA = new double[11];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor no vetor A - " + i);
            vetorA[i] = Math.pow(2, i);
        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }


    }
}
