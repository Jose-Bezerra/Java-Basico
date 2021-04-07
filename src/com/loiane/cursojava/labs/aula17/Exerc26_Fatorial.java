package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc26_Fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int operadorFatorial = num;
        System.out.println("Fatorial de " + num);

        System.out.print(num + "! = 5.");
        for (int i = num - 1; i > 1 ; i--) {
            operadorFatorial *= i;
            System.out.print(i + ".");
        }


        System.out.print("1 = " + operadorFatorial);

    }
}
