package com.github.StephanyMil.poo_2023_01.t17.lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
