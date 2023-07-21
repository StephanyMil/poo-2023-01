package com.github.StephanyMil.poo_2023_01.t17.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Resposta {
    private String aluno;
    private List<String> respostas;

    public Resposta(String aluno) {
        this.aluno = aluno;
        this.respostas = new ArrayList<>();
    }
}
