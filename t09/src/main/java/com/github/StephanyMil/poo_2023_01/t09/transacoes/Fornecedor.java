package com.github.StephanyMil.poo_2023_01.t09.transacoes;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private List<Transacao> transacoes;

    public Fornecedor(String nome) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

}
