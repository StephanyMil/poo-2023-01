package com.github.StephanyMil.poo_2023_01.t18.xadez;

import java.util.ArrayList;
import java.util.List;

public class PartidaImortal {
    private List<Lance> lances;
    private Jogador jogador1;
    private Jogador jogador2;
    private String detalhes;

    public PartidaImortal(Jogador jogador1, Jogador jogador2, String detalhes) {
        this.lances = new ArrayList<>();
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.detalhes = detalhes;
    }

    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public void imprimirPartida() {
        System.out.println("Detalhes da Partida: " + detalhes);
        System.out.println("Jogador 1: " + jogador1.getNome());
        System.out.println("Jogador 2: " + jogador2.getNome());
        System.out.println("Lances da Partida:");
        for (int i = 0; i < lances.size(); i++) {
            Lance lance = lances.get(i);
            System.out.println("Lance " + (i + 1) + ": " + lance.getDescricao());
        }
    }
}
