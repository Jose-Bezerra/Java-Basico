package com.loiane.cursojava.test;

import com.loiane.cursojava.diversos.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);
    }
}
