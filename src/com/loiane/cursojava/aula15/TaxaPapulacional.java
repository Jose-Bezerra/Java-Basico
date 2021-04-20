package com.loiane.cursojava.aula15;

public class TaxaPapulacional {
    public static void main(String[] args) {
        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;
        int anos = 0;

        while (populacaoPaisA <= populacaoPaisB) {
            populacaoPaisA += (populacaoPaisA/100) * 3;
            populacaoPaisB += (populacaoPaisB / 100) * 1.5;
            anos++;
        }

        System.out.println("População País A " +  populacaoPaisA );
        System.out.println("População País B " +  populacaoPaisB );
        System.out.println("Anos " +  anos );
    }
}
