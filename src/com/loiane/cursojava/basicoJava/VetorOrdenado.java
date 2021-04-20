package com.loiane.cursojava.basicoJava;

import java.util.Scanner;

public class VetorOrdenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO_VETOR = 7;
        float[] temperaturas = new float[TAMANHO_VETOR];
        float x; // varíável auxiliar para ordenação do vetor

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura - dia " + (i+1));
            temperaturas[i] = scanner.nextFloat();
        }

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = i + 1; j < temperaturas.length; j++) {
                if (temperaturas[j] < temperaturas[i]) {
                    x = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[j] = x;
                }
            }
        }

        System.out.println("Temperaturas da semana ordenadas: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

    }
}
