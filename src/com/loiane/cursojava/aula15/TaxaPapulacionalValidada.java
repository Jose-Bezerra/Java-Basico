package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class TaxaPapulacionalValidada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double populacaoA;
        double populacaoB;
        int taxaA;
        int taxaB;
        int anos = 0;
        boolean flag = false;

        do {
            System.out.println("Entre com a população A: ");
            populacaoA = scanner.nextDouble();
            if (populacaoA > 0) {
              flag = true;
            } else {
                System.out.println("Populacao precisa ser maior que zero!");
            }

        } while (!flag);

        flag = false;
        do {
            System.out.println("Entre com a população B: ");
            populacaoB = scanner.nextDouble();
            if (populacaoB > 0) {
              flag = true;
            } else {
                System.out.println("Populacao precisa ser maior que zero!");
            }

        } while (!flag);


        flag = false;
        do {
            System.out.println("Entre com a Taxa Crescimento A: ");
            taxaA = scanner.nextInt();
            if (taxaA > 0) {
              flag = true;
            } else {
                System.out.println("Populacao precisa ser maior que zero!");
            }

        } while (!flag);

        flag = false;
        do {
            System.out.println("Entre com a Taxa Crescimento B: ");
            taxaB = scanner.nextInt();
            if (taxaB > 0) {
              flag = true;
            } else {
                System.out.println("Populacao precisa ser maior que zero!");
            }

        } while (!flag);

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            anos++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Anos: " + anos);

    }
}
