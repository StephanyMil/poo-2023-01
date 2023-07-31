package com.github.StephanyMil.poo_2023_01.t19.cartas;

public class Jogador {
    private String nome;
    private MaoJogador mao;

    public Jogador(String nome, MaoJogador mao) {
        this.nome = nome;
        this.mao = mao;
    }

    public MaoJogador getMao() {

        return mao;
    }

    @Override
    public String toString() {

        return nome;
    }
}