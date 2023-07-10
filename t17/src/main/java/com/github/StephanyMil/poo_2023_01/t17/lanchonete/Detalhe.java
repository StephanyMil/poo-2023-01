package com.github.StephanyMil.poo_2023_01.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;
public class Detalhe {
    private String descricao;
    private List<String> acompanhamentos;

    public Detalhe(String descricao) {
        this.descricao = descricao;
        this.acompanhamentos = new ArrayList<>();
    }

    public void adicionarAcompanhamento(String acompanhamento) {
        this.acompanhamentos.add(acompanhamento);
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getAcompanhamentos() {
        return acompanhamentos;
    }
}
