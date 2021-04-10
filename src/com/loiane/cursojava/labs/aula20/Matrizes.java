package com.loiane.cursojava.labs.aula20;

public class Matrizes {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4]; //30 linhas e 4 colunas

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][3] = 10;
        notasAlunos[2][2] = 7;

        //imprimindo matriz na tela
        for (int i = 0; i < notasAlunos.length; i++) { //percorre as linhas
//            System.out.print(notasAlunos[i] + " ");
            for (int j = 0; j < notasAlunos[i].length; j++) { //percorre as colunas
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        //mudando valor de uma célula na matriz
        notasAlunos[1][3] = 8;
        for (int i = 0; i < 4; i++) {
            System.out.print(notasAlunos[1][i] + " ");
        }

        System.out.println("Calculando a média de cada aluno");
        double soma;

        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é = " + (soma/notasAlunos[i].length));
        }
    }
}
