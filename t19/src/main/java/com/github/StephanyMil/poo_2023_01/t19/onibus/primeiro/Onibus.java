package com.github.StephanyMil.poo_2023_01.t19.onibus.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private List<Viagem> viagens;

    public Onibus() {
        viagens = new ArrayList<>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public List<Viagem> getViagens() {
        return viagens;
    }
}