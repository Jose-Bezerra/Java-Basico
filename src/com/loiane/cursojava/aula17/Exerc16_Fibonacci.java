package com.loiane.cursojava.aula17;

public class Exerc16_Fibonacci {
    public static void main(String[] args) {

        int primeiroElemento = 0;
        int segundoElemento = 1;
        int auxiliar = 0;

        while ( auxiliar <= 500 )  {
            auxiliar = primeiroElemento + segundoElemento;
            primeiroElemento = segundoElemento;
            segundoElemento = auxiliar;
            System.out.print(primeiroElemento + " ");

        }

    }
}
