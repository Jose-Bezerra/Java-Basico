package com.loiane.cursojava.aulas.labs.aula17;

import java.util.Scanner;

public class Exer03_ValideIdadeSalarioSexoEstadoCivil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean flag = false;

        do { //valida nome
            System.out.println("Entre com seu nome: ");
            nome = scanner.next();
            if (nome.length() <= 3) {
                System.out.println("Digite um nome com mais de três caracteres");
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        do { //valida idade
            System.out.println("Idade: ");
            idade = scanner.nextInt();
            if (idade <= 0 || idade > 150) {
                System.out.println("Informe a idade entre 0 e 150 anos! ");
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        do { //valida salario
            System.out.println("Salário: ");
            salario = scanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Digite um salário maior que R$ 0,00.");
                flag = true;
            } else {
                flag = false;
            }
        } while (flag);

        do { //valida sexo
            System.out.println("Sexo: ");
            sexo = scanner.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                flag = true;
            } else {
                System.out.println("Digite ( F - Feminimo ou M - Masculino )");
                flag = false;
            }
        } while (!flag);

        do { //valida estado civil
            System.out.println("Estado Civil: ");
            estadoCivil = scanner.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                flag = true;
            } else {
                System.out.println("Digite ( S - Solteiro, C - Casado, V - Viúvo, D - Divorciado");
                flag = false;
            }
        } while (!flag);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salário: " + salario);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
