package com.github.StephanyMil.poo_2023_01.t19.revisao;

import java.util.ArrayList;
import java.util.List;

public class Software {
    private String nome;
    private List<Versao> versoes;

    public Software(String nome) {
        this.nome = nome;
        versoes = new ArrayList<>();
    }

    public void adicionarVersao(Versao versao) {
        versoes.add(versao);
    }

    public List<Versao> getVersoes() {
        return versoes;
    }

    @Override
    public String toString() {
        return "Software: " + nome;
    }
}