package com.loiane.cursojava.aulas.aula24.labs;

public class ContaCorrente {
    public String numero;
    public String agencia;
    public boolean especial;
    public double limiteEspecial;
    public double valorEspecialUsado;
    public double saldo;

    public boolean realizarSaque(double valorSaque) {
        if (saldo >= valorSaque) { //tem saldo na conta?
            saldo -= valorSaque;
            return true;
        } else { //não tem saldo na conta!
            if (especial) {
                //verificar se limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valorSaque) {
                    saldo -= valorSaque;
                    return true;
                } else {
                    return false;
                }
            } else  {
                return false;//não é especial e não tem saldo suficiente
            }
        }
    }

    public void depositar(double valorDepositado) {
        saldo +=  valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}
