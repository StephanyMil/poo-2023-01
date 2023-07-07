package com.github.StephanyMil.poo_2023_01.t09.conteiner;

import java.util.ArrayList;
import java.util.List;

public class Conteiner extends Elemento {
    private List<Elemento> conteineres;

    public Conteiner(String numeracao) {
        super(numeracao);
        conteineres = new ArrayList<>();
    }

    public void adicionarConteiner(Elemento conteiner) {
        conteineres.add(conteiner);
    }

    public List<Elemento> getElementos() {
        return conteineres;
    }

}