package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc17_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        System.out.print(num + "! = ");
        int fatorial = num;

        for (int i = num - 1; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(fatorial);


    }
}
