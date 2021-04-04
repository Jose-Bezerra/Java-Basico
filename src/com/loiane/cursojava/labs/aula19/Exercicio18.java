package com.loiane.cursojava.labs.aula19;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa " +  (i + 1));
            idades[i] = scanner.nextInt();
        }

        int idadeMenor = idades[0];
        int posMenor = 0;
        int idadeMaior = idades[0];
        int posMaior = 0;

        for (int i = 1; i < idades.length ; i++) {
            if (idades[i] < idadeMenor) {
                idadeMenor = idades[i];
                posMenor = i;
            } else if ( idades[i] > idadeMaior) {
                idadeMaior = idades[i];
                posMaior = i;
            }
        }


        System.out.print("Vetor A = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();

        System.out.println("Menor idade: " + idadeMenor);
        System.out.println("Posição do Elemento: " + posMenor);
        System.out.println("Maior idade: " + idadeMaior);
        System.out.println("Posição do Elemento: " + posMaior);


    }
}
