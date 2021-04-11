package com.loiane.cursojava.aulas.labs.aula17;

import java.text.DecimalFormat;

public class Exerc31 {
    public static void main(String[] args) {
        double salario = 1000; //1995
        double percentual = 1.5;
        salario += (salario / 100) * percentual; //1996

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i < 2020; i++) {
            percentual *= 2; //dobra
            salario += (salario / 100) * percentual;
            System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
        }

    }
}
