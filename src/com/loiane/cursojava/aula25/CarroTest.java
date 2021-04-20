package com.loiane.cursojava.aula25;

public class CarroTest {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        System.out.println("O método exibirAutonomia foi chamado anteriormente");
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia da Van é de : " + autonomia);
        System.out.println("A autonomia da Van é de : " + van.obterAutonomia());

        double qtdCombustivel10 = van.calcularCombustivel(10);
        System.out.println("Quantidade de litros para 10km: " + qtdCombustivel10);

    }
}
