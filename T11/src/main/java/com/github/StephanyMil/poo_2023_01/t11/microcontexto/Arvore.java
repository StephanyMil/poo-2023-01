package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;
public class Arvore {
    private List<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public List<Folha> getFolhas() {
        return folhas;
    }
}
