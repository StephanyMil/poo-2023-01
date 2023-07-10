package com.github.StephanyMil.poo_2023_01.t17.nota_fiscal;

public class Item {
    private Produto produto;
    private int quantidade;
    private float precoUnitario;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }
}
