package com.loiane.cursojava.aula17;

import java.util.Scanner;

public class Exerc30_TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        int num = scanner.nextInt();

        int numInicio;
        int numFinal;
        boolean invalido = true;


        do {
            System.out.println("Entre com valor inicial da tabuada: ");
            numInicio = scanner.nextInt();
            System.out.println("Entre com valor final da tabuada: ");
            numFinal = scanner.nextInt();
            if (numFinal > numInicio){
                invalido = false;
            }
        }while (invalido);

        System.out.println(" Tabuada de " + num + ":") ;
        System.out.println(" Começa por:  " + numInicio);
        System.out.println(" Termina por:  " + numFinal);

        for (int i = numInicio; i <= numFinal; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

}
