package com.loiane.cursojava.aulas.labs.aula19;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int qtdNumerosImpares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 != 0) {
                qtdNumerosImpares++;
            }
        }

        int pares = vetorA.length - qtdNumerosImpares;
        // vetorA.length -> 100%
        // numImpares -> x
        // x * vetorA.length = 100 * numImpares
        // x == (100 * numImpares) / vetorA.length
        double porcImpar = (100 * qtdNumerosImpares) / vetorA.length;
        double porcPar = 100 - porcImpar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Porecentagem Pares: " + porcPar);
        System.out.println("Porecentagem Ímpares: " + porcImpar);

    }
}
