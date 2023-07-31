package com.github.StephanyMil.poo_2023_01.t19.agencia.segunda;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }
}