package com.github.StephanyMil.poo_2023_01.t17.aeroporto;

import java.util.ArrayList;
import java.util.List;
public class Voo {
    private Aviao aviao;
    private List<Lugar> lugares;
    private Tripulacao tripulacao;
    private Operacao operacao;

    public Voo(Aviao aviao, Tripulacao tripulacao, Operacao operacao) {
        this.aviao = aviao;
        this.tripulacao = tripulacao;
        this.operacao = operacao;
        lugares = new ArrayList<>();
    }
}
