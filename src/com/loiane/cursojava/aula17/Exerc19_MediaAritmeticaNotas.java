package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc19_MediaAritmeticaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int num = scanner.nextInt();
        double nota;
        double soma = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            nota = scanner.nextDouble();
            soma += nota;
        }

        System.out.println("A média Artimética é: " +  (soma / num));
    }
}
