package com.loiane.cursojava.test;

import com.loiane.cursojava.diversos.ContaCorrente;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNumero("1095668");
        contaCorrente.setAgencia("0321");
        contaCorrente.setEspecial(true);
        contaCorrente.setLimiteEspecial(500);
        contaCorrente.setValorEspecialUsado(0);
        contaCorrente.setSaldo(-10);

        System.out.println("Saldo da conta " + contaCorrente.getNumero() + " / ag " + contaCorrente.getAgencia()
            +  " é: " + contaCorrente.getSaldo());

        boolean saqueEfetuado = contaCorrente.realizarSaque(10);
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual da conta: " + contaCorrente.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!!");
        }
        saqueEfetuado = contaCorrente.realizarSaque(500);
        System.out.println("Tentativa de saque de R$500");
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            contaCorrente.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente!!");
        }

        System.out.println("Depósito de R$ 500");
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial!");
        } else {
            System.out.println("Não está usando cheque especial!");
        }

        System.out.println("Saque de R$600");
        contaCorrente.realizarSaque(600);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial!" +
                    "");
        } else {
            System.out.println("Não está usando cheque especial!");
        }

    }
}
