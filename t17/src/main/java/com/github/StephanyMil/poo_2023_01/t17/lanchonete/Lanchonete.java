package com.github.StephanyMil.poo_2023_01.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;
public class Lanchonete {
    private List<Sanduiche> sanduiches;
    public Lanchonete() {
        this.sanduiches = new ArrayList<>();
    }

    public void adicionarSanduiche(Sanduiche sanduiche) {
        this.sanduiches.add(sanduiche);
    }

    public List<Sanduiche> getSanduiches() {
        return sanduiches;
    }
}
