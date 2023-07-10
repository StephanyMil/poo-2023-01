package com.github.StephanyMil.poo_2023_01.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;
public class Tripulacao {
    private Piloto piloto;
    private CoPiloto coPiloto;
    private List<Aeromoca> aeromocas;

    public Tripulacao(Piloto piloto, CoPiloto coPiloto) {
        this.piloto = piloto;
        this.coPiloto = coPiloto;
        aeromocas = new ArrayList<>();
    }
}
