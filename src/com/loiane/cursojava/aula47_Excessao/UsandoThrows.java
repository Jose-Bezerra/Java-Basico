package com.loiane.cursojava.aula47_Excessao;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um valor decimal: ");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida: ");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception{
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }
}
