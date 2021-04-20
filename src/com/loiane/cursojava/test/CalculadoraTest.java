package com.loiane.cursojava.test;

import com.loiane.cursojava.diversos.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTela(Calculadora.soma(2, 3));
        imprimirTela(Calculadora.subtrair(6, 8));
        imprimirTela(Calculadora.multiplicar(4, 2));
        imprimirTela(Calculadora.dividir(10, 5));
        imprimirTela(Calculadora.potencia(2, 4));

        int num;
        do {
            System.out.println("Entre com um número positivo: ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Número inválido, entre novamente.");
            }
        } while (num < 0);

        System.out.println(Calculadora.falorial(num));
        System.out.println(Calculadora.fatorialRecursivo(num));
    }

    static void imprimirTela(int num) {
        System.out.println(num);
    }
}
