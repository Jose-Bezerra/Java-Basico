package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int qtd = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade da pessoa " +  (i + 1));
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] > 35){
                qtd++;
            }

        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade pessoas idade > 35: " + qtd);


    }
}
