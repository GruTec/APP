package com.example.mpspapp.Models;

public class UsuarioModel {

    private String user;
    private String pass;
    private String email;
    private String telefone;
    private String nome;

    public UsuarioModel(String user, String pass, String email, String telefone, String nome) {
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
