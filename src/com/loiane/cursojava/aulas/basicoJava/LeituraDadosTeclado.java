package com.loiane.cursojava.aulas.basicoJava;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine(); //Leitura da linha
        System.out.println("Seu nome é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();
        System.out.println("Seu primeiro nome: " + primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("A sua altura é: " + altura);

    }
}
