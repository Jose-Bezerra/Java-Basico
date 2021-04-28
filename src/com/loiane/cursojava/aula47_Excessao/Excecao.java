package com.loiane.cursojava.aula47_Excessao;

public class Excecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];

            System.out.println("Antes da Exception!");

            vetor[4] = 5;
            System.out.println("Esse texto não será impresso!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção ao acessar um índice do vetor que não existe!");
        }

        System.out.println("Texto impresso após a exception!");
    }
}
