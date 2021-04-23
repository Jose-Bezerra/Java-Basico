package com.loiane.cursojava.aula46;

public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private Figura2D areaBase;
    private int numPoligonosBase;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(Figura2D areaBase) {
        this.areaBase = areaBase;
    }

    public int getNumPoligonosBase() {
        return numPoligonosBase;
    }

    public void setNumPoligonosBase(int numPoligonosBase) {
        this.numPoligonosBase = numPoligonosBase;
    }

    @Override
    public double calcularArea() {
        if (areaBase != null) {
            return ((numPoligonosBase * (arestaBase * apotema)) / 2) + areaBase.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (areaBase != null) {
            return (areaBase.calcularArea()) * altura / 3;
        }
        return 0;

    }
}
