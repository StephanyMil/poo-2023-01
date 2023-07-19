package com.github.StephanyMil.poo_2023_01.t08.diretorio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Diretorio> diretorios;

    public Usuario(String nome) {
        this.nome = nome;
        this.diretorios = new ArrayList<>();
    }
}
