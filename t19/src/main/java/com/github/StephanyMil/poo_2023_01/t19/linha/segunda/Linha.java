package com.github.StephanyMil.poo_2023_01.t19.linha.segunda;

import java.util.ArrayList;
import java.util.List;

public class Linha {
    private List<Ponto> pontos;

    public Linha(Ponto ponto1, Ponto ponto2) {
        this.pontos = new ArrayList<>();
        pontos.add(ponto1);
        pontos.add(ponto2);
    }

    public List<Ponto> getPontos() {
        return pontos;
    }
}