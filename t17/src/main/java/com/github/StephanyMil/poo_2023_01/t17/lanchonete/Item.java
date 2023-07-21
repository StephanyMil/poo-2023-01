package com.github.StephanyMil.poo_2023_01.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private List<Sanduiche> sanduiches;
    private List<Detalhe> detalhes;
    private List<Bebida> bebidas;

    public Item(Sanduiche sanduiche) {
        this.sanduiches = new ArrayList<>();
        this.detalhes = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    public void adicionarDetalhe(Detalhe detalhe) {
        this.detalhes.add(detalhe);
    }

    public void adicionarBebida(Bebida bebida) {
        this.bebidas.add(bebida);
    }

    public void adicionarSanduiche(Sanduiche sanduiche){
        this.sanduiches.add(sanduiche);
    }

    public List<Detalhe> getDetalhes() {
        return detalhes;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public List<Sanduiche> getSanduiches(){
        return sanduiches;
    }
}
