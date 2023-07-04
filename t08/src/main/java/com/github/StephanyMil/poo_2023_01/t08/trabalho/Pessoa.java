package com.github.StephanyMil.poo_2023_01.t08.trabalho;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Empresa> empresas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.empresas = new ArrayList<>();
    }

    public void adicionarEmprego(Empresa emprego) {
        empresas.add(emprego);
    }
}