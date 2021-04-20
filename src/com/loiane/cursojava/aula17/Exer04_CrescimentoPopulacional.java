package com.loiane.cursojava.aula17;

public class Exer04_CrescimentoPopulacional {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0;

        while (popA < popB) {
            //calculando o crescimento da população de acordo com a taxa de crescimento
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            anos++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos: " + anos);
    }
}
