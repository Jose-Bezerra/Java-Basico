package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class VadlideNomeUsuarioESenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String senha;
        boolean infoValida;

        do {
            System.out.println("Digite login: ");
            nome = scanner.next();
            System.out.println("Digite a senha: ");
            senha = scanner.next();
            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("A senha não pode ser igual a senha!");
                infoValida = true;
            } else {
                System.out.println("Senha aceita com sucesso!!");
                infoValida = false;
            }
        } while (infoValida);
    }
}
