package com.loiane.cursojava.basicoJava;

import javax.swing.*;

public class Vetor_Grafico1 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        String num;
        
        try {
            for (int i = 0; i < vetorA.length; i++) {
                num = JOptionPane.showInputDialog("Vetor A - Posição: " + i);
                vetorA[i] = Integer.parseInt(num);
            }

            for (int i = 0; i < vetorA.length; i++) {
                if (i % 2 == 0) {
                    vetorB[i] = vetorA[i] * 5;
                } else {
                    vetorB[i] = vetorA[i] + 5;
                }
            }

            System.out.printf("%s%n", "Resultado:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("%s%d%s%d%s", "vetorA[", i, "] = ", vetorA[i], " ");
                System.out.printf("%10s%d%s%d%s\n", "vetorB[", i, "] = ", vetorB[i], " " );
            }



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de execução!");
        }
        
    }
}
