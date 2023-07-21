package com.github.StephanyMil.poo_2023_01.t09.viajante;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {
    private List<Pedido> pedidos;

    public ListaPedidos() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
