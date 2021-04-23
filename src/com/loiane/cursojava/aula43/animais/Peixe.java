package com.loiane.cursojava.aula43.animais;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        super();
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("cinzento");
        this.caracteristicas = ("Barbatanas e cauda.");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;
        return s;
    }
}
