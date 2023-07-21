package com.github.StephanyMil.poo_2023_01.t09.transacoes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Transacao> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }
}
