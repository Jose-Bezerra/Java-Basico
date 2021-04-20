package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int numA = scanner.nextInt();
        System.out.println("Entre com outro número: ");
        int numB = scanner.nextInt();

        int soma = 0;
        if (numA > numB) {
            for (int i = numB + 1; i < numA; i++) {
                soma += i;
                System.out.print(i + " ");
            }
        } else {
            for (int i = numA + 1; i < numB; i++) {
                soma += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("Soma = " + soma);

    }

}
