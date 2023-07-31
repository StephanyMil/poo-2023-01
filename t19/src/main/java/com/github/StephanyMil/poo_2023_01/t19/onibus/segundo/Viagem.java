package com.github.StephanyMil.poo_2023_01.t19.onibus.segundo;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private Cidade origem;
    private Cidade destino;
    private Onibus onibus;
    private List<Papel> papeis;

    public Viagem(Cidade origem, Cidade destino) {
        this.origem = origem;
        this.destino = destino;
        this.onibus = onibus;
        this.papeis = new ArrayList<>();
    }

    public Cidade getOrigem() {
        return origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void adicionarPapel(Papel papel) {
        papeis.add(papel);
    }

    public List<Papel> getPapeis() {
        return papeis;
    }
}