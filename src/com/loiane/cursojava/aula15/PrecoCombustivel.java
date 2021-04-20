package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class PrecoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a qtd de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.println("Informe o tipo de combustível");
        String tipo = scanner.next();

        double precoGas = 2.5;
        double precoAlcool = 1.9;
        int perDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("A")) {
            if (litros <= 20) {
                perDesconto = 3;
            } else {
                perDesconto = 5;
            }

            total = litros * precoAlcool;

        } else if (tipo.equalsIgnoreCase("G")) {
            if (litros <= 20) {
                perDesconto = 4;
            } else {
                perDesconto = 6;
            }
            total = litros * precoGas;
        }

        totalDesconto = ( total / 100 ) * perDesconto;
        double precoAPagar = total - totalDesconto;
        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
