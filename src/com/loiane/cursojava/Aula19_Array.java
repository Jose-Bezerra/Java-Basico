package com.loiane.cursojava;

public class Aula19_Array {
    public static void main(String[] args) {
        int[] conjuntoDeNumeros = new int[20];
        conjuntoDeNumeros[0] = 1;
        conjuntoDeNumeros[1] = 2;
        conjuntoDeNumeros[2] = 3;
        conjuntoDeNumeros[3] = 4;
        conjuntoDeNumeros[4] = 5;
        conjuntoDeNumeros[5] = 6;
        conjuntoDeNumeros[6] = 7;
        conjuntoDeNumeros[7] = 8;
        conjuntoDeNumeros[8] = 9;
        conjuntoDeNumeros[9] = 10;

        System.out.println("O tamanho do array é: " + conjuntoDeNumeros.length);

        for (int i = 0; i < conjuntoDeNumeros.length; i++) {
            System.out.println("Valor armazenado na posição: " + i + " é " + conjuntoDeNumeros[i]);
        }

        for ( int num: conjuntoDeNumeros) {
            System.out.println(num);
        }

    }
}
