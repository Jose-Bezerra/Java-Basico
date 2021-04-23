package com.loiane.cursojava.aula43.bytebank;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }


    @Override
    public String toString() {
        String s = "Conta Poupança. \n";
        s += "Dia do Rendimento: " + diaRendimento + "\n";
        s += super.toString();
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRedimento) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo + taxaRendimento;
            super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRedimento));
            return true;
        }
        return false;
    }
}
