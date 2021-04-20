package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc21_MediaIdades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de turmas: ");
        int numTurmas = scanner.nextInt();
        int numAlunos;
        int soma = 0;
        boolean flag = true;

        for (int i = 1; i <= numTurmas; i++) {
            do {
                flag = false;
                System.out.println("Digite o número de alunos para turma: " + i);
                numAlunos = scanner.nextInt();
                if (numAlunos > 40) {
                    flag = true;
                    System.out.println("Número de alunos inválido!");
                }
            } while (flag);
            soma += numAlunos;
        }

        System.out.println("Média: " + (soma / numTurmas));

    }
}
