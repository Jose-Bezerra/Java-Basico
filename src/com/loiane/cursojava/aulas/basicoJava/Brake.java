package com.loiane.cursojava.aulas.basicoJava;

import java.util.Scanner;

public class Brake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um número:");
        String string1 = scanner.next();
        System.out.println("Entre com um limite:");
        String string2 = scanner.next();
        //convertendo a String para int:
        int num = Integer.parseInt(string1);
        int max = Integer.parseInt(string2);

        for (int i = num; i <= max; ++i) {
//            System.out.println(i);
            if (i % 7 == 0) {
                //break; //Só o primeiro divisível me interessa
                continue;
            }
            System.out.println("O valor de i é: " + i);
//
        }
    }
}
