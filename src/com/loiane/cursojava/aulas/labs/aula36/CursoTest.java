package com.loiane.cursojava.aulas.labs.aula36;

import java.util.Scanner;

public class CursoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ente com o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.println("Entre com horário do curso: ");
        String horario = scanner.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProfessor = scanner.nextLine();

        System.out.println("Entre com o departamento: ");
        String departamentoProfessor = scanner.nextLine();

        System.out.println("Entre com o email do professor: ");
        String emailProfessor = scanner.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(departamentoProfessor);
        professor.setEmail(emailProfessor);

        curso.setProfessor(professor);

        System.out.println("----Alunos----");
        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            scanner.nextLine();
            System.out.println("Entre com o nome do aluno " + (i +1 ));
            String nomeAluno = scanner.nextLine();
            System.out.println("Entre com o matrícula do aluno " + (i +1 ));
            String matAluno = scanner.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota + " + (j + 1));
                notas[j] = scanner.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
