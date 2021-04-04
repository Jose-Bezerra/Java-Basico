package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exer05_ValidaCrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double popA;
        double popB;
        int anos = 0;
        double taxaA;
        double taxaB;
        boolean flag = false;

        do {
            System.out.println("Entre com a população de A: ");
            popA = scanner.nextDouble();
            if (popA > 0) {
                flag = true;
            } else {
                System.out.println("População precisa maior que zero!");
            }
        } while (!flag);

        flag = false;
        do {
            System.out.println("Entre com a população de B: ");
            popB = scanner.nextDouble();
            if (popB > 0) {
                flag = true;
            } else {
                System.out.println("População precisa maior que zero!");
            }
        } while (!flag);

        flag = false;
        do {
            System.out.println("Entre com a taxa da popA: ");
            taxaA = scanner.nextDouble();
            if ( taxaA > 0 ) {
                flag = true;
            } else {
                System.out.println("Insira uma taxa maior que 0!");
            }
        } while (!flag);

        flag = false;
        do {
            System.out.println("Entre com a taxa da popB: ");
            taxaB = scanner.nextDouble();
            if (taxaB > 0) {
                flag = true;
            } else {
                System.out.println("Insira uma taxa maior que 0!");
            }
        } while (!flag);

        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            anos++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População A: " + popB);
        System.out.println("Taxa A " + taxaA);
        System.out.println("Taxa B " + taxaB);
        System.out.println(anos + " anos.");

    }

}
