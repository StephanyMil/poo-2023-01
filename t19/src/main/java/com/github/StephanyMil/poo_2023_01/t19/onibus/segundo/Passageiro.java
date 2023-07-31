package com.github.StephanyMil.poo_2023_01.t19.onibus.segundo;

public class Passageiro extends Papel {
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