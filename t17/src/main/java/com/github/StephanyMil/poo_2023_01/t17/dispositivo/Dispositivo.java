package com.github.StephanyMil.poo_2023_01.t17.dispositivo;

public class Dispositivo {
    private Mouse mouse;
    private Teclado teclado;
    private PlacaMae placaMae;
    private Memoria memoria;
    private CPU cpu;

    public Dispositivo(Mouse mouse, Teclado teclado, PlacaMae placaMae, Memoria memoria, CPU cpu) {
        this.mouse = mouse;
        this.teclado = teclado;
        this.placaMae = placaMae;
        this.memoria = memoria;
        this.cpu = cpu;
    }
}
