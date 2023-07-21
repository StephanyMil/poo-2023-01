package com.github.StephanyMil.poo_2023_01.t17.comite;

import java.util.ArrayList;
import java.util.List;

public class Comite {
    private String nome;
    private List<Pessoa> membros;
    private List<Pessoa> presidentes;

    public Comite(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
        this.presidentes = new ArrayList<>();
    }

    public void adicionarMembro(Pessoa pessoa) {
        membros.add(pessoa);
    }

    public void adicionarPresidente(Pessoa pessoa) {
        presidentes.add(pessoa);
    }
}
