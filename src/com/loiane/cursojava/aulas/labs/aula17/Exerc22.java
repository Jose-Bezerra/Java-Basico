package com.loiane.cursojava.aulas.labs.aula17;

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o número de CDs: ");
        int cds = scanner.nextInt();

        double preco;
        double soma = 0;

        for (int i = 1; i <= cds ; i++) {
            System.out.println("informe o valor do CD "+ i);
            preco = scanner.nextDouble();
            soma += preco;
        }

        System.out.println("Média gasta com cada CD: " + (soma / cds));

    }
}
