package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc15_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero para ver a sequência de Fibonacci: ");
        int num = scanner.nextInt();

        int primeiroElemento = 0;
        int segundoElemento = 1;
        int auxiliar;

        for (int i = 1; i <= num; i++) {
            System.out.print(primeiroElemento + " ");
            auxiliar = primeiroElemento + segundoElemento;
            primeiroElemento = segundoElemento;
            segundoElemento = auxiliar;

        }

    }
}
