package com.loiane.cursojava.aulas.labs.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scanner.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(decimalFormat.format(vetorA[i]) + " ");
        }


    }
}
