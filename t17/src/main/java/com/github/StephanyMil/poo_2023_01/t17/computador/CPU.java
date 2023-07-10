package com.github.StephanyMil.poo_2023_01.t17.computador;

public class CPU {
    private Memoria memoria;

    public CPU(Memoria memoria) {
        this.memoria = memoria;
    }

    public void acessarMemoria() {
        // Acessar a memória
        memoria.acessar();
    }
}
