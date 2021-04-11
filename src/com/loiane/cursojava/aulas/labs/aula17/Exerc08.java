package com.loiane.cursojava.aulas.labs.aula17;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número inteiro: ");
            num = scanner.nextInt();
            soma += num;
            cont++;
        }

        System.out.println("A soma dos números são: " + soma);
        System.out.println("A média simples dos número são: " +  (soma / cont));

    }

}
