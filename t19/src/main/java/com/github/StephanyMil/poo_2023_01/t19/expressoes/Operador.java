package com.github.StephanyMil.poo_2023_01.t19.expressoes;

public abstract class Operador extends Elemento {
    protected Elemento esquerda;
    protected Elemento direita;

    public Operador(Expressao expressao, Elemento esquerda, Elemento direita) {
        super(expressao);
        this.esquerda = esquerda;
        this.direita = direita;
    }
}