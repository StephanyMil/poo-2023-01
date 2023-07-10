package com.github.StephanyMil.poo_2023_01.t17.dispositivo;

public class CPU extends Dispositivo {
    private PlacaMae placaMae;
    private Memoria memoria;

    public CPU(Mouse mouse, Teclado teclado, PlacaMae placaMae, Memoria memoria, CPU cpu) {
        super(mouse, teclado, placaMae, memoria, cpu);
    }
}
