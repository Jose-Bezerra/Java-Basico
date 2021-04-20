package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc12_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número para gerar a tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada de " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println( num + " * "  + i  + " = " + (num * i));
        }

    }

}
