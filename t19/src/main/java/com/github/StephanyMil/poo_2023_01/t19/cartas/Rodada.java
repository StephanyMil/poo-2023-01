package com.github.StephanyMil.poo_2023_01.t19.cartas;

import java.util.List;
import java.util.ArrayList;

public class Rodada {
    private Monte monte;
    private List<Jogador> jogadores;

    public Rodada(Monte monte) {
        this.monte = monte;
        jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
}