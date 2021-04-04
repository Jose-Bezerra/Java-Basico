package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc13_Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a base: ");
        int base = scanner.nextInt();
        System.out.println("Entre com a potência: ");
        int pow = scanner.nextInt();

        int resultado = base;
        for (int i = 1; i < pow; i++) {
           resultado *= base;
        }

        System.out.println("O resultado da potência é: " + resultado);



    }

}
