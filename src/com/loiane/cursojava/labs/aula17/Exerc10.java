package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int numA = scanner.nextInt();
        System.out.println("Entre com outro número: ");
        int numB = scanner.nextInt();

        if (numA > numB) {
            for (int i = numB + 1; i < numA; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = numA + 1; i < numB; i++) {
                System.out.print(i + " ");
            }
        }


    }

}
