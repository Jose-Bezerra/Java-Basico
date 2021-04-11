package com.loiane.cursojava.aulas.aula24.labs;

public class Lampada {

    public String modelo;
    public String tensao;
    public int potencia;
    public String cor;
    public String tipoLuz;
    public int garantiaMeses;
    public String[] tipos;
    public boolean tipoAbajur;

    public boolean estadoLampadada;

    public void ligar() {
        estadoLampadada = true;
    }

    public void desligar() {
        estadoLampadada = false;
    }

    public void mostrarEstado() {
        if (estadoLampadada) {
            System.out.println("Lâmpada Ligada!");
        } else {
            System.out.println("Lampada Desligada");
        }
    }

    public void mudarEstado() {
        if (estadoLampadada) {
            desligar();
        } else {
            ligar();
        }
    }


}
