package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private List<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }

}
