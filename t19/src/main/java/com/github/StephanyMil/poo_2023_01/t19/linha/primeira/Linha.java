package com.github.StephanyMil.poo_2023_01.t19.linha.primeira;

public class Linha {
    private Ponto p1;
    private Ponto p2;

    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
}