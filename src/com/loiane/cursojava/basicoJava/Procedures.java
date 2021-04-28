package com.loiane.cursojava.basicoJava;

import java.util.Scanner;

public class Procedures {

    static int v1, v2, result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        do {
            System.out.println("Escollha a opção: \n1 - Adição\n2 - Subtração\n" +
                    "3 - Multiplicação\n4 - Divisão\n0 - Sair\n");
            opcao = scan.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do Sistema!");
                    break;

                case 1:
                    modAdicao();
                    break;
                case 2:
                    modSubtracao();
                    break;
                case 3:
                    modMultiplicacao();
                    break;
                case 4:
                    modDivisao();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");


            }
        } while (opcao != 0);
    }

    private static void lendoInformacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número v1: ");
        v1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um número v2: ");
        v2 = Integer.parseInt(scanner.nextLine());
    }

    private static void modAdicao() {
        lendoInformacoes();
        System.out.println("A soma de v1 + v2 é " + (v1 + v2) + "\n");
    }


    private static void modSubtracao() {
        lendoInformacoes();
        System.out.println("A diferença de v1 - v2 é " + (v1 - v2) + "\n");
    }

    private static void modMultiplicacao() {
        lendoInformacoes();
        System.out.println("A multiplicação de v1 * v2 é " + (v1 * v2) + "\n");

    }

    private static void modDivisao() {
        lendoInformacoes();
        System.out.println("A divisão de v1 / v2 é " + (v1 / v2) + "\n");
    }
}
