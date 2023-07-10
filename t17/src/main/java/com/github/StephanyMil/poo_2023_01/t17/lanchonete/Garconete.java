package com.github.StephanyMil.poo_2023_01.t17.lanchonete;

public class Garconete {
    private Lanchonete lanchonete;

    public Garconete(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public Pedido anotarPedido() {
        Pedido pedido = new Pedido();
        return pedido;
    }
}
