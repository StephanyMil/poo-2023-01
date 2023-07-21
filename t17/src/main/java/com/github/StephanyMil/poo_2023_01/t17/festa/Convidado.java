package com.github.StephanyMil.poo_2023_01.t17.festa;

import java.util.ArrayList;
import java.util.List;

public class Convidado {
    private String nome;
    private boolean acompanhado;
    private String genero;
    private List<Danca> dancaMusica;

    public Convidado(String nome, boolean acompanhado, String genero) {
        this.nome = nome;
        this.acompanhado = acompanhado;
        this.genero = genero;
        this.dancaMusica = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public boolean isAcompanhado() {
        return acompanhado;
    }

    public String getGenero() {
        return genero;
    }
    public void adicionarDanca(Danca danca) {
        this.dancaMusica.add(danca);
    }

    public List<Danca> getDancaMusica() {
        return dancaMusica;
    }
}
