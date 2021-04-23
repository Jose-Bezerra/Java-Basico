package com.loiane.cursojava.aula43.bytebank;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        double saldoComLimite = super.getSaldo() + valor;
        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(super.getSaldo() - valor);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String s = "Conta Especial. \n";
        s += "Limite: " + limite + "\n";
        s += super.toString();
        return s;
    }
}
