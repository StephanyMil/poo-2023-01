package com.github.StephanyMil.poo_2023_01.t19.onibus.segundo;

public class Motorista extends Papel {
    private String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Motorista: " + nome;
    }
}