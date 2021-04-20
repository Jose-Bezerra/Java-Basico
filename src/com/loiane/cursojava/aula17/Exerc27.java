package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de temperaturas para cálculo da média: ");
        int qtdTemperaturas = scanner.nextInt();
        double temperatura;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        for (int i = 0; i < qtdTemperaturas; i++) {
            System.out.println("Digite a temperatura - " + (i + 1));
            temperatura = scanner.nextDouble();
            soma += temperatura;
            if (temperatura >= maior) {
                maior = temperatura;
            } else if (temperatura < menor) {
                menor = temperatura;

            }
        }

        System.out.println("Maior Temperatura: " + maior);
        System.out.println("Menor Temperatura: " + menor);
        System.out.println("Média: " + (soma / qtdTemperaturas));

    }
}
