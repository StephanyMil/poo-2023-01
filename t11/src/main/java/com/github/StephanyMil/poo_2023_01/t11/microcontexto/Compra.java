package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<ItemCompra> itens;

    public Compra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCompra item) {
        itens.add(item);
    }
}
