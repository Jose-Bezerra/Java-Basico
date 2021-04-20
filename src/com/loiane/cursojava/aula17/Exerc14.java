package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um número; ");
            num = scanner.nextInt();
            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }

}
