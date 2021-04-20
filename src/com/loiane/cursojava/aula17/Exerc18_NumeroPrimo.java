package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc18_NumeroPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        boolean flag = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                System.out.printf("O número %d NÃO é PRIMO!", num);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("O número %d é PRIMO", num);
        }
    }
}
