package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um numero na posição " + (i + 1));
            vetorA[i] = scanner.nextInt();
        }

        //número palíndromo: 1221; 4554;
        boolean flag = true;
        for (int i = 0; i < (vetorA.length/2); i++) {
            if (vetorA[i] != vetorA[(vetorA.length - 1) - i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("O vetor é um palíndromo!");
        } else {
            System.out.println("O vetor não é um palíndromo!");
        }

    }
}
