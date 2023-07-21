package com.github.StephanyMil.poo_2023_01.t17.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    private String nome;
    private String finalidade;
    private String data;
    private List<Questao> questoes;

    public Avaliacao(String nome, String finalidade, String data) {
        this.nome = nome;
        this.finalidade = finalidade;
        this.data = data;
        this.questoes = new ArrayList<>();
    }
}
