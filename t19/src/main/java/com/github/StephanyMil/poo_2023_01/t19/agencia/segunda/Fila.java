package com.github.StephanyMil.poo_2023_01.t19.agencia.segunda;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Cliente> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente proximoCliente() {
        return fila.poll();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }
}