package com.github.StephanyMil.poo_2023_01.t09.transacoes;

public class Transacao {
    private String descricao;
    private double valor;

    public Transacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
