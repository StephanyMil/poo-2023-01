package com.github.StephanyMil.poo_2023_01.t19.associacoes.modelo;

public class Estudante extends Atividade {
    private Atividade atividade;

    public Estudante(String nome) {

        super(nome);
    }

    public Atividade getAtividade() {

        return atividade;
    }

    public void setAtividade(Atividade atividade) {

        this.atividade = atividade;
    }
}