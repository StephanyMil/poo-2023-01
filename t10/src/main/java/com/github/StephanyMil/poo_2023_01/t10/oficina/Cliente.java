package com.github.StephanyMil.poo_2023_01.t10.oficina;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    Oficina oficina;
    private String nome;
    private int idade;
    private String telefone;
    List<Bicicleta> bicicletas;
    private List<Percurso> percursos;
    private List<Conserto> consertos;

    public Cliente(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.bicicletas = new ArrayList<>();
        this.percursos = new ArrayList<>();
        this.consertos = new ArrayList<>();
    }
}
