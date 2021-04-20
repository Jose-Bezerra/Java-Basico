package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exer01_ValidaNotaEntreZeroEDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean notaValida = false;
        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
            if (nota > 0 && nota <= 10){
                System.out.println("Você digitou a nota: " + nota);
                notaValida = true;
            }
        } while (!notaValida);
    }
}
