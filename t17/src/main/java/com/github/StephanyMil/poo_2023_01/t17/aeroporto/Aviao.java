package com.github.StephanyMil.poo_2023_01.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Aviao {
    private List<Lugar> lugares;

    public Aviao() {
        lugares = new ArrayList<>();
    }

    public void adicionarLugar(Lugar lugar) {
        lugares.add(lugar);
    }

    public List<Lugar> getLugares() {
        return lugares;
    }
}
