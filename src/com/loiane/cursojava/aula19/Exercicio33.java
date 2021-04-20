package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor no vetor A - " + i);
            vetorA[i] = scanner.nextInt();
        }

        //algoritmo números primos
        boolean primo;
        String msg;

        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }


            if (primo) {
                msg = " é primo!";
            } else {
                msg = " não é primo!";
            }

            System.out.println(vetorA[i] + msg);
        }




    }
}
