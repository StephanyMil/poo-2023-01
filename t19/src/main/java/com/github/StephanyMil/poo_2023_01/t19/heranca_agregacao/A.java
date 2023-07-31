package com.github.StephanyMil.poo_2023_01.t19.heranca_agregacao;

import java.util.List;
import java.util.ArrayList;

public class A {
    private List<B> listaDeB;

    public A() {
        listaDeB = new ArrayList<>();
    }

    public void adicionarB(B b) {
        listaDeB.add(b);
    }

    public List<B> getListaDeB() {
        return listaDeB;
    }
}