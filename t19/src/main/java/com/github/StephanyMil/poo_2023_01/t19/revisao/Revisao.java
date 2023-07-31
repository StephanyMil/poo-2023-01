package com.github.StephanyMil.poo_2023_01.t19.revisao;

public class Revisao extends Versao {
    private String descricao;

    public Revisao(String numero, String descricao) {
        super(numero);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Revisão " + getNumero() + ": " + descricao;
    }
}