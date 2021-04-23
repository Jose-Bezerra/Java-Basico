package com.loiane.cursojava.aula43.bytebank;

public class Test {
    public static void main(String[] args) {
        System.out.println("*** Teste ContaBancária ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNomeConta("01095668");

        System.out.println(contaPoupanca);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);
        contaPoupanca.setDiaRendimento(22);
        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado. Seu saldo é de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje, não é dia de rendimento. Seu saldo é de: " + contaPoupanca.getSaldo());
        }

        System.out.println();
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNomeConta("01095668");

        System.out.println(contaEspecial);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso! Saldo de: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insufuciente para saque! Saldo de: " + conta.getSaldo());
        }
    }
}
