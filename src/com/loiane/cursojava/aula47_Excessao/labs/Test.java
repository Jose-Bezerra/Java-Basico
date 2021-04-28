package com.loiane.cursojava.aula47_Excessao.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
             opcao = obterOpcaoMenu(scanner);
            if (opcao == 1) { //Consultar contato
                consultarContato(agenda, scanner);
            } else if (opcao == 2) { //Adicionar contato
                adicionarContato(agenda, scanner);
            }

        }

    }

    public static void adicionarContato(Agenda agenda, Scanner scan) {
        try {
            System.out.println("Criando um contato: ");
            String nome = leInformacaoString(scan, "Entre com o nome: ");
            String telefone = leInformacaoString(scan, "Entre com o telefone do contato");
            String email = leInformacaoString(scan, "Entre com o email do contato");
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Agenda agenda, Scanner scan) {
        String nomeContato = leInformacaoString(scan, "Entre com o nome do contato para pesquisa: ");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato  existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String input = scan.nextLine();
        return input;
    }

    public static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: sair");


            try {
                String input = scan.nextLine();//pode dar erro dependendo do que o usuário digitar.
                opcao = Integer.parseInt(input);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }


        return opcao;

    }
}
