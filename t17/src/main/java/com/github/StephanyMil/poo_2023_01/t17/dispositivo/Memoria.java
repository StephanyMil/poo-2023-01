package com.github.StephanyMil.poo_2023_01.t17.dispositivo;

public class Memoria extends Dispositivo {
    private CPU cpu;

    public Memoria(Mouse mouse, Teclado teclado, PlacaMae placaMae, Memoria memoria, CPU cpu) {
        super(mouse, teclado, placaMae, memoria, cpu);
    }
}
