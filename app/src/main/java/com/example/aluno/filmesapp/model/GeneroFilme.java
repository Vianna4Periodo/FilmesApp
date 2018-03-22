package com.example.aluno.filmesapp.model;

import java.io.Serializable;

/**
 * Created by aluno on 13/03/2018.
 */

public class GeneroFilme implements Serializable{
    private int id;
    private String  descricao;

    public GeneroFilme() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GeneroFilme(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
