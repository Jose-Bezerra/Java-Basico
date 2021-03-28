package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class OperacoesArtimeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter com o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter com o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Entre com a operação ( + - * / )");
        String operacao = scanner.next();

        double resultado = 0;
        boolean valida = true; //flag

        switch (operacao) {
            case "+" :
                resultado = num1 + num2;
                break;
            case "-" :
                resultado =  num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                valida = false;
        }

        if (valida) {
            System.out.println("Resultado " + resultado);
            if (resultado >= 0) {
                System.out.println("Resultado positivo.");
            } else {
                System.out.println("Resultado negativo");
            }

            if (resultado % 2 == 0) {
                System.out.println("Resultado PAR.");
            } else {
                System.out.println("Resultado íMPAR.");
            }
        }

    }
}
