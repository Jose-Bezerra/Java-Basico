package com.loiane.cursojava.basicoJava;

import javax.swing.*;
import java.awt.*;

public class Vetor_Grafico {
    public static void main(String[] args) {
        try {
            float[] vetorA = new float[5];
            float media, soma = 0;
            String num;
            for (int i = 0; i < vetorA.length; i++) {
                num = JOptionPane.showInputDialog("Digite o valor do vetorA - " + i + " :");
                vetorA[i] = Float.parseFloat(num);
                soma += vetorA[i];
            }

            media = soma / vetorA.length;
            JOptionPane.showMessageDialog(null, "Média " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro duranta a leitura.");
        }
    }
}
