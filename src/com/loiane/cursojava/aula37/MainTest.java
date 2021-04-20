package com.loiane.cursojava.aula37;

public class MainTest {
    public static void main(String[] args) {
//        Aluno aluno = new Aluno();
//        Professor professor = new Professor();
//        Pessoa pessoa = new Pessoa();

        Pessoa aluno = new Aluno(); //Polimorfismo
        Pessoa professor = new Professor();

//        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

//        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}
