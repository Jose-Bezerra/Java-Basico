package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver um intervalo de números primos: ");
        int num = scanner.nextInt();
        boolean primo;

        for (int i = 1; i <= num; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }

    }


}

