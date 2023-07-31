package com.github.StephanyMil.poo_2023_01.t19.expressoes;

public class Operando extends Elemento {
    private double valor;

    public Operando(Expressao expressao, double valor) {
        super(expressao);
        this.valor = valor;
    }

    @Override
    public double avaliar() {
        return valor;
    }
}