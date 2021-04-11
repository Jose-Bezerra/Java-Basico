package com.loiane.cursojava.aulas.labs.aula15;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do coeficiente a: ");
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Equação não é do Segundo Grau!");
        } else {
            System.out.println("Entre com o valor do coeficiente b: ");
            int b = scanner.nextInt();
            System.out.println("Entre com o valor do coeficiente c: ");
            int c = scanner.nextInt();
            double delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Delta negativo, sem raízes reais");
            } else  {
                System.out.println("O valor de Delta é: " + delta);
                double x1 = (-b + Math.sqrt(delta)) / ( 2 * a);
                System.out.println(x1);
                double x2 = (-b - Math.sqrt(delta)) / ( 2 * a);
                System.out.println(x1);
            }
        }

    }
}
