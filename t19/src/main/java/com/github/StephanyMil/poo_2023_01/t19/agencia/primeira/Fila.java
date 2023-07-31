package com.github.StephanyMil.poo_2023_01.t19.agencia.primeira;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    private List<Cliente> fila;

    public Fila() {
        fila = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente proximoCliente() {
        if (!fila.isEmpty()) {
            return fila.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }
}