package com.github.StephanyMil.poo_2023_01.t19.nomeacao;

public class Presidente {
    private String nome;
    private Ministro ministro;

    public Presidente(String nome, Ministro ministro) {
        this.nome = nome;
        this.ministro = ministro;
    }
}