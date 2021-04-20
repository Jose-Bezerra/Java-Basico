package com.loiane.cursojava.aula42;

public class Test {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        final String valorImutavel = "valor Inicial";
        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "http://uol.com.br";
        System.out.println(Constantes.URL_BLOG);

    }
}
