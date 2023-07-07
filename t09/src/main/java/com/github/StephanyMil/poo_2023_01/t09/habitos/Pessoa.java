package com.github.StephanyMil.poo_2023_01.t09.habitos;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {
    private String nome;
    private int idade;
    private List<Habito> habitos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habitos = new ArrayList<>();
    }

}
