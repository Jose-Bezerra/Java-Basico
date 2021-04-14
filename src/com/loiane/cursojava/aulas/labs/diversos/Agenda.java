package com.loiane.cursojava.aulas.labs.diversos;

public class Agenda {
    private String nome;
    private Contact[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contact[] getContatos() {
        return contatos;
    }

    public void setContact(Contact[] contatos) {
        this.contatos = contatos;
    }


    public String getInfo() {
        String info = "Nome = " + nome + "\n";
        if (contatos != null) {
            for (Contact c : contatos) {
                info += c.getInfo() + "\n";
            }
        }

        return info;
    }
}
