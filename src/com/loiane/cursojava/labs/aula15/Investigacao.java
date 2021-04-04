package com.loiane.cursojava.labs.aula15;

import java.util.Scanner;

public class Investigacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? ");
        String resp1 = scanner.next();
        System.out.println("Esteve no local do crime? ");
        String resp2 = scanner.next();
        System.out.println("Mora perto da vítima? ");
        String resp3 = scanner.next();
        System.out.println("Já trabalhou com a vítima? ");
        String resp4 = scanner.next();
        System.out.println("Devia para a vítima? ");
        String resp5 = scanner.next();

        int contador = 0;

        if (resp1.equalsIgnoreCase("S")) contador++;
        if (resp2.equalsIgnoreCase("S")) contador++;
        if (resp3.equalsIgnoreCase("S")) contador++;
        if (resp4.equalsIgnoreCase("S")) contador++;
        if (resp5.equalsIgnoreCase("S")) contador++;

         switch (contador) {
             case 0:
                 System.out.println("Inocente");
                 break;
             case 2:
                 System.out.println("Suspeita");
                 break;
             case 3:
             case 4:
                 System.out.println("Cúmplice");
                 break;
             case 5:
                 System.out.println("Culpado");
                 break;
         }

    }
}
