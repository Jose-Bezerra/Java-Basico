package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um numero na posição " + ( i + 1));
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] % 2 != 0) {
                break;
            }
        }


    }
}
