package com.github.StephanyMil.poo_2023_01.t09.viajante;

public class Armazem {
    private String nome;
    private ListaPedidos listaPedidos;

    public Armazem(String nome) {
        this.nome = nome;
        listaPedidos = new ListaPedidos();
    }
}
