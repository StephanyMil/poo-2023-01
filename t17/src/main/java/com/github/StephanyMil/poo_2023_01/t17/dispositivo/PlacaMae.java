package com.github.StephanyMil.poo_2023_01.t17.dispositivo;

public class PlacaMae extends Dispositivo{
    private CPU cpu;

    public PlacaMae(Mouse mouse, Teclado teclado, PlacaMae placaMae, Memoria memoria, CPU cpu) {
        super(mouse, teclado, placaMae, memoria, cpu);
    }
}
