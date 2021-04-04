package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número inteiro: ");
            num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

    }

}
