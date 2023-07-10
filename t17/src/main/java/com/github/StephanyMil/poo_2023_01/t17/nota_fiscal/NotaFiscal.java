package com.github.StephanyMil.poo_2023_01.t17.nota_fiscal;

import java.util.ArrayList;
import java.util.List;
public class NotaFiscal {
    private List<Item> itens;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
