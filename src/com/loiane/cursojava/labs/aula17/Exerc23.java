package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Loja Quase Dois - Tabela de preços ");

        for (int i = 1; i <= 50; i++) {
//            System.out.println(i +  " - R$ "+ (1.99 * i));
            System.out.printf("%d%5s%s\n", i, "- R$", (1.99 * i));
        }

    }
}
