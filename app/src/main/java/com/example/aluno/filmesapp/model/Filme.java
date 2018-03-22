package com.example.aluno.filmesapp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by aluno on 13/03/2018.
 */

public class Filme implements Serializable {

    private int id,anoLancamento,classificacao;
    private String titulo,descricao,comentario,atores;
    private Date dataAssistiu;
    private GeneroFilme genero;
    private Usuario usuario;
    private EStatus status;

    public Filme() {
    }

    public Filme(int id, int anoLancamento, int classificacao, String atores, String titulo, String descricao, String comentario, Date dataAssistiu, GeneroFilme genero, Usuario usuario, EStatus status) {
        this.id = id;
        this.anoLancamento = anoLancamento;
        this.classificacao = classificacao;
        this.atores = atores;
        this.titulo = titulo;
        this.descricao = descricao;
        this.comentario = comentario;
        this.dataAssistiu = dataAssistiu;
        this.genero = genero;
        this.usuario = usuario;
        this.status = status;
    }

    public Filme(int id, int anoLancamento, int classificacao, String titulo, String descricao, String comentario, String atores, Date dataAssistiu) {
        this.id = id;
        this.anoLancamento = anoLancamento;
        this.classificacao = classificacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.comentario = comentario;
        this.atores = atores;
        this.dataAssistiu = dataAssistiu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String  atores) {
        this.atores = atores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataAssistiu() {
        return dataAssistiu;
    }

    public void setDataAssistiu(Date dataAssistiu) {
        this.dataAssistiu = dataAssistiu;
    }

    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }
}
