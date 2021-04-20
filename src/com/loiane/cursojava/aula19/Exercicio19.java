package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas1 = new double[3];
        double[] notas2 = new double[notas1.length];
        double[] results = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.printf("1º bimestre - Aluno %d: ", (i + 1));
            notas1[i] = scanner.nextDouble();
            System.out.printf("2º bimestre - Aluno %d: ", (i + 1));
            notas2[i] = scanner.nextDouble();
            results[i] = (notas1[i] + notas2[i]) / 2;
        }


        System.out.printf("Notas do 1º bimestre (%s alunos): %n", notas1.length);
        for (int h = 0; h < notas1.length; h++) {
            System.out.print(notas1[h] + " ");
        }

        System.out.println();
        System.out.printf("Notas do 2º bimestre (%s alunos): %n", notas2.length);
        for (int k = 0; k < notas2.length; k++) {
            System.out.print(notas2[k] + " ");
        }

        System.out.println();
        System.out.printf("Média (%s alunos): %n", results.length);
        for (int k = 0; k < notas1.length; k++) {
            System.out.print(results[k] + " ");
            if (results[k] > 7) {
                System.out.println("Aluno " + (k + 1) + "  aprovado!");
            } else {
                System.out.println("Aluno " + (k + 1) + " reprovado!");
            }
        }

    }
}
