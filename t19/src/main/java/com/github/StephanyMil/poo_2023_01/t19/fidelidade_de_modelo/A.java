package com.github.StephanyMil.poo_2023_01.t19.fidelidade_de_modelo;

public class A {
    private String nome;

    public A(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void metodoA() {
        System.out.println("Método A executado por " + nome);
    }
}