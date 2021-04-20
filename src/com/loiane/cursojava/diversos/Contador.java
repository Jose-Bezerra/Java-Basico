package com.loiane.cursojava.diversos;

public class Contador {

    private static int cont;//esta variável estática pertence à classe e não ao objeto;

    public Contador() {
        cont++;
    }

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int getValor() {
        return cont;
    }
}
