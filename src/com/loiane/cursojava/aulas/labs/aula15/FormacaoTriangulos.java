package com.loiane.cursojava.aulas.labs.aula15;

import java.util.Scanner;

public class FormacaoTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criando um triângulo com lados a, b e c.");
        System.out.println("Entre com o lado a: ");
        double a = scanner.nextDouble();

        System.out.println("Entre com lado b: ");
        double b = scanner.nextDouble();

        System.out.println("Entre com lado c: ");
        double c = scanner.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)){
            System.out.print("Estes segmentos formam um triângulo ");
            if (a == b && b == c) {
                System.out.println("Equilátero.");
            } else if ( a != b && b != c && a != c) {
                System.out.println("Escaleno.");
            } else {
                System.out.println("Isósceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
