package com.github.StephanyMil.poo_2023_01.t17.festa;

import java.util.ArrayList;
import java.util.List;
public class Convite {
    private Convidado convidado;
    private List<Festa> festas;

    public Convite(Convidado convidado) {
        this.convidado = convidado;
        this.festas = new ArrayList<>();
    }

    public void adicionarFesta(Festa festa) {
        this.festas.add(festa);
    }

    public List<Festa> getFestas() {
        return festas;
    }

    public Convidado getConvidado() {
        return convidado;
    }
}
