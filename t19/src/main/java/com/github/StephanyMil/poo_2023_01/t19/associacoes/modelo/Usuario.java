package com.github.StephanyMil.poo_2023_01.t19.associacoes.modelo;

public class Usuario extends Pessoa {
    private Atividade atividade;

    public Usuario(String nome) {
        super(nome);
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}