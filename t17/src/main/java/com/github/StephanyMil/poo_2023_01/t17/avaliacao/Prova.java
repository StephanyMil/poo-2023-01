package com.github.StephanyMil.poo_2023_01.t17.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private List<Aluno> alunos;
    private Avaliacao avaliacao;

    public Prova(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
        this.alunos = new ArrayList<>();
    }
}
