package com.loiane.cursojava.aulas.labs.diversos;

public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][4];

    public Aluno() {
         nomeDisciplinas = new String[3];
         notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
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

    private double ObterMedia(int index) { //private porque se trata de um método auxiliar
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[index].length; i++) {
            soma += notasDisciplinas[index][i];
        }
        double media = soma / notasDisciplinas[index].length;
        return media;
    }

    public void setNomeDisciplinaNaPosicao (int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotasDisciplinasPosicaoIJ (int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }
    
}
