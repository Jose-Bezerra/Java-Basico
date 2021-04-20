package com.loiane.cursojava.test;

import com.loiane.cursojava.diversos.Agenda;
import com.loiane.cursojava.diversos.Contact;

import java.util.Scanner;

public class AgendaTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o nome da agenda: ");
        String nome = scanner.nextLine();
        Agenda agenda = new Agenda(nome); //ou
//        Agenda agenda1 = new Agenda();
//        agenda1.setNome(nome);

       //vamos cria a lista de contatos - 3x para agenda
        Contact[] contatos = new Contact[3];
        //Criando o primeiro contato
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato: ");
            Contact c1 = new Contact();
            System.out.println("Nome: ");
            nome = scanner.nextLine();
            c1.setNome(nome);
            System.out.println("Telefone: ");
            String telefone = scanner.nextLine();
            c1.setTelefone(telefone);
            System.out.println("Email: ");
            String email = scanner.nextLine();
            c1.setEmail(email);

            contatos[i] = c1;
        }

        agenda.setContact(contatos);
        if (agenda != null) {
            System.out.println(agenda.getInfo());
        }

    }
}
