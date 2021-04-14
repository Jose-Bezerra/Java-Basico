package com.loiane.cursojava.aulas.labs.diversos;

public class Contact {
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return "Nome = " + getNome() + "; " +
                " Telefone = " + getTelefone() + "; " +
                " Email = " + getEmail();
    }

}
