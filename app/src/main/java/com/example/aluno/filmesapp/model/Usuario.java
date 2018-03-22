package com.example.aluno.filmesapp.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by aluno on 13/03/2018.
 */

public class Usuario implements Serializable {

    private int id;
    private String nome,login,senha;
    private GeneroFilme genero;
    private boolean ehAdministrador;
    private ArrayList<Filme> filmes;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, String senha, GeneroFilme genero, boolean ehAdministrador) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.genero = genero;
        this.ehAdministrador = ehAdministrador;
        this.filmes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }

    public boolean isEhAdministrador() {
        return ehAdministrador;
    }

    public void setEhAdministrador(boolean ehAdministrador) {
        this.ehAdministrador = ehAdministrador;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
}
