package com.github.StephanyMil.poo_2023_01.t19.fidelidade_de_modelo;

import java.util.ArrayList;
import java.util.List;

public class B extends A {
    private List<A> listaDeA;

    public B(String nome) {
        super(nome);
        listaDeA = new ArrayList<>();
    }

    public void adicionarA(A a) {
        listaDeA.add(a);
    }

    public List<A> getListaDeA() {
        return listaDeA;
    }

    public void metodoB() {
        System.out.println("Método B executado por " + getNome());
    }
}