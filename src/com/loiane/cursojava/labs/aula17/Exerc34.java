package com.loiane.cursojava.labs.aula17;

import java.util.Scanner;

public class Exerc34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1, j = 1; i <= num; i++, j += 2) {
            System.out.print(i + "/" + j + " + ");
        }
    }
}
