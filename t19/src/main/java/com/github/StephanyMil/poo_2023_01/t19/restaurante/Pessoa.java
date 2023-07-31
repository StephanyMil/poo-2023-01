package com.github.StephanyMil.poo_2023_01.t19.restaurante;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome;
    }
}