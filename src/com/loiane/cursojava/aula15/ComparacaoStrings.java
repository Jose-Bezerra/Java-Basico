package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class ComparacaoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o sexo ( F ou M ): ");
//        String input = scanner.next();
//
//        if (input.equalsIgnoreCase("f")) {
//            System.out.println(input + " Feminino");
//        } else if (input.equalsIgnoreCase("m")) {
//            System.out.println(input + " Masculino");
//        } else {
//        System.out.println("Letra inválida");
//        }

        char input = scanner.next().charAt(0);
        if (input == 'F' || input == 'f') {
            System.out.println(input + " Feminino");
        } else if (input == 'M' || input == 'm') {
            System.out.println(input + " Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
