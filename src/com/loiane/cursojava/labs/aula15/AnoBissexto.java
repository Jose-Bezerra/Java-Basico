package com.loiane.cursojava.labs.aula15;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ano para ver se é Bissexto: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano BISSEXTO!");
        } else {
            System.out.println(ano + " NÃO é um ano bissexto.");
        }
    }
}
