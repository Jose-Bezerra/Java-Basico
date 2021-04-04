package com.loiane.cursojava.labs.aula15;

import java.util.Scanner;

public class ComparandoVogaisConsoantes {
    public static void main(String[] args) {
        System.out.println("Entre com uma letra: ");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.next();

        if (letra.length() > 1 ) {
            System.out.println("Letra inválida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        }
    }
}
