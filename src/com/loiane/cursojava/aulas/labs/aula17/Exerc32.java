package com.loiane.cursojava.aulas.labs.aula17;

import java.util.Scanner;

public class Exerc32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = true;
        int status, cod, qtd;
        double total = 0;
        String output = "";


        System.out.println("Digite 1 para fazer pedido ou 0 para sair:");
        status = scanner.nextInt();
        do {
            if (status == 0) {
                output += "total a pagar: " + total;
                break;
            }
            System.out.println("Informe código e quantidade de produtos: ");
            cod = scanner.nextInt();
            qtd = scanner.nextInt();

            switch (cod) {
                case 100:
                    output += "Cachorro quente -> 1,20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                    break;
                case 101:
                    output += "Bauru Simples -> 1,30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                    break;
                case 102:
                    output += "Bauru com ovos -> 1,50 * " + qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                    break;
                case 103:
                    output += "Hambúrguer -> 1.20 * " + qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                    break;
                case 104:
                    output += "Cheeseburguer -> 1.30 * " + qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                    break;
                case 105:
                    output += "Refrigerante -> 1.00 * " + qtd;
                    output += " = " + (1.0 * qtd) + "\n";
                    total += 1.0 * qtd;
                    break;
                default:

                    terminar = false;
            }


        } while (terminar);

        System.out.println(output);
    }
}
