package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de pessoa entrevistadas: ");
        int numEntrevistados = scanner.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Quantos filhos? ");
            int qtdFilhos = scanner.nextInt();

            nomesFilhos[i] = new String[qtdFilhos]; //na posição i estamos criando outro vetor.
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j + 1));
                nomesFilhos[i][j] = scanner.next();
            }
        }

        //imprimindo a saida da pesquisa
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }

    }
}
