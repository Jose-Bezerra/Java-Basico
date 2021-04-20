package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        int qtdNumerosImpares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                qtdNumerosImpares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Média: " + (soma / qtdNumerosImpares) );

    }
}
