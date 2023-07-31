package com.github.StephanyMil.poo_2023_01.t19.onibus.primeiro;

public class Passageiro {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Passageiro: " + nome;
    }
}