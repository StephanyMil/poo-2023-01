package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Carne {
    private Compra compra;
    private List<Prestacao> prestacoes;

    public Carne(Compra compra) {
        this.compra = compra;
        this.prestacoes = new ArrayList<>();
    }

    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }
}
