package com.github.StephanyMil.poo_2023_01.t18.xadez;

public class Lance {
    private Jogador jogador;
    private String descricao;

    public Lance(Jogador jogador, String descricao) {
        this.jogador = jogador;
        this.descricao = descricao;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Lance{" +
                "jogador=" + jogador +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
