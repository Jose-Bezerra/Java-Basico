package com.loiane.cursojava.aulas.aula24.labs;

public class Aluno {

    public String nome;
    public String matricula;
    public String nomeCurso;
    public String[] disciplinas = new String[3];
    public double[][] notasDisciplinas = new double[3][4];

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int index) {

        if (ObterMedia(index) >= 7) {
            return true;
        } else {
            return false;
        }

    }

    public double ObterMedia(int index) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[index].length; i++) {
            soma += notasDisciplinas[index][i];
        }
        double media = soma / notasDisciplinas[index].length;
        return media;
    }

    
}
