package com.loiane.cursojava.aula25;

public class Carro {
     String marca;
     String modelo;
     int numPassageiros;
     double capCombustivel;
     double consumoCombustivel;

     void exibirAutonomia() {
         System.out.println("A autonomia do carro é de " + (capCombustivel * consumoCombustivel) + "km");
     }

     double obterAutonomia() {
         System.out.println("O método obterAutonomia foi chamado.");
         return capCombustivel * consumoCombustivel;
     }

     double calcularCombustivel(double km) {
         //consumo = km / litrosCombustivel
         return km / consumoCombustivel;
     }
}
