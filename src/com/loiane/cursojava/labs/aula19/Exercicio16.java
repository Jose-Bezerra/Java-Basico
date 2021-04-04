package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaMenorQue15 = 0;
        int igual15 = 0;
        int somaMaiorQue15 = 0;
        int qtdMaiorQue15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] < 15) {
                somaMenorQue15 += vetorA[i];
            } else if (vetorA[i] == 15) {
                igual15++;
            } else {
                somaMaiorQue15 += vetorA[i];
                qtdMaiorQue15++;
            }

        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Qtd números == 15: " + igual15);
        System.out.println("Qtd números < 15: " + somaMenorQue15);
        System.out.println("Qtd números > 15: " + somaMaiorQue15);
        System.out.println("Média números > 15: " + (somaMaiorQue15 / qtdMaiorQue15));

    }
}
