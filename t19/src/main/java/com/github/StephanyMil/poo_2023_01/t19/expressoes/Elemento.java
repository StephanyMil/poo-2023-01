package com.github.StephanyMil.poo_2023_01.t19.expressoes;

public abstract class Elemento {
    protected Expressao expressao;

    public Elemento(Expressao expressao) {
        this.expressao = expressao;
    }

    public abstract double avaliar();
}