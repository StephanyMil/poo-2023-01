package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Armario {
    private List<Prateleira> prateleiras;

    public Armario() {
        prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }
}
