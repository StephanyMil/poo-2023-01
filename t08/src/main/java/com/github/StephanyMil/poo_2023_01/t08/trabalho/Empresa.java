package com.github.StephanyMil.poo_2023_01.t08.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Pessoa> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }
}
