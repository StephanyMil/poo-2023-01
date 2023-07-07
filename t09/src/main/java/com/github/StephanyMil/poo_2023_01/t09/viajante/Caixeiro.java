package com.github.StephanyMil.poo_2023_01.t09.viajante;

import java.util.ArrayList;
import java.util.List;

public class Caixeiro {
    private List<Viagem> viagens;

    public Caixeiro() {
        viagens = new ArrayList<>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

}
