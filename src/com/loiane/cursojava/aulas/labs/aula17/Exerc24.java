package com.loiane.cursojava.aulas.labs.aula17;

public class Exerc24 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora pão de ontem - Tabela ");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i +  " - R$ "+ (0.18 * i));
//            System.out.printf("%d%5s%s\n", i, "- R$", (1.99 * i));
        }

    }
}
