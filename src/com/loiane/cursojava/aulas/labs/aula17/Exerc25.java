package com.loiane.cursojava.aulas.labs.aula17;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total = 0;
        String output;
        double valorPago;
        double troco;

        do {

            System.out.println("Deseja infomar uma nova compra? S/N ");
            continuarCompra = scanner.next();

            if (continuarCompra.equalsIgnoreCase("S")) {

                output = "Lojas Tabajara\n";

                System.out.println("Digite a quantidade de produtos: ");
                qtdProdutos = scanner.nextInt();

                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe o preço do produto: " + i);
                    preco = scanner.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }

                System.out.println();
                output += "Total: R$ " + total;
                System.out.println(output);

                System.out.println("Entre com o valor pago: ");
                valorPago = scanner.nextDouble();

                output = " Dinheiro: R$ " + valorPago + "\n";

                troco = valorPago - total;

                output = "Troco: R$ " + troco;

                System.out.println(output);

            } else {

                sair = true;
            }

        } while (!sair);
    }
}
