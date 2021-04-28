package com.loiane.cursojava.basicoJava;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1, v2;
        int opcao;
        System.out.println("""
                Escollha a opção:\s
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                0 - Sair
                """);

        System.out.println("Digite um número v1: ");
        v1 = Integer.parseInt(scan.nextLine());
        System.out.println("Digite um número v2: ");
        v2 = Integer.parseInt(scan.nextLine());


        do {

            opcao = scan.nextInt();
            switch (opcao) {
                case 0 -> System.out.println("Saindo do Sistema!");
                case 1 -> modAdicao(v1, v2);
                case 2 -> modSubtracao(v1, v2);
                case 3 -> modMultiplicacao(v1, v2);
                case 4 -> modDivisao(v1, v2);
                default -> System.out.println("Opção inválida! Tente novamente!");
            }
        } while (opcao != 0);
    }



    private static void modAdicao(int a, int b) {
        System.out.println("A soma de v1 + v2 é " + (a + b) + "\n");
    }


    private static void modSubtracao(int a, int b) {
        System.out.println("A diferença de v1 - v2 é " + (a - b) + "\n");
    }

    private static void modMultiplicacao(int a, int b) {
        System.out.println("A multiplicação de v1 * v2 é " + (a * b) + "\n");

    }

    private static void modDivisao(int a, int b) {
        System.out.println("A divisão de v1 / v2 é " + (a / b) + "\n");
    }
}
