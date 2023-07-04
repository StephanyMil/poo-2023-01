package com.github.StephanyMil.poo_2023_01.t08.projeto;

import java.util.ArrayList;
import java.util.List;

public class ProjetoSoftware {
    private List<String> LinguagensProgramacao;

    public ProjetoSoftware() {
        LinguagensProgramacao = new ArrayList<>();
    }

    public void addLinguagensProgramacao(String linguagem) {
        LinguagensProgramacao.add(linguagem);
    }

    public List<String> getLinguagensProgramacao() {
        return LinguagensProgramacao;
    }
}