package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exerc04_Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] compromissos = new String[31][24]; //31 dias, 24 horas;

        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scanner.nextByte();
            if (opcao == 1) { //adicionar o compromisso
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com dia do mês:");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês:");
                    hora = scanner.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }

                System.out.println("Digite o compromisso: ");
                compromissos[--dia][hora] = scanner.next(); //--dia. primeiro subtrai e depois atribui

            } else if (opcao == 2) {//verificar compromisso
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com dia do mês:");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês:");
                    hora = scanner.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }

                    dia--;
                    System.out.println("O compromisso agendado é: ");
                    System.out.println(compromissos[dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida, digite novmaente!");
            }
        }

    }
}
