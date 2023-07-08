package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;
public class Floresta {
    private List<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    public List<Arvore> getArvores() {
        return arvores;
    }
}
