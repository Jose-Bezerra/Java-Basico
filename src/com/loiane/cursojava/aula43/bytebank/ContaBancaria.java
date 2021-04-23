package com.loiane.cursojava.aula43.bytebank;

public class ContaBancaria {
    private String nomeCliente;
    private String nomeConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
      String s = "";
      s += "Nome do cliente: " + nomeCliente + "\n";
      s += "Nome da conta: " + nomeConta + "\n";
      s += "Saldo da conta: " + saldo;
      return s;
    }
}
