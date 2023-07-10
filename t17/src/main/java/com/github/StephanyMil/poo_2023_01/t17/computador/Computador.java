package com.github.StephanyMil.poo_2023_01.t17.computador;

public class Computador {
    private final CPU cpu;
    private PlacaMae placaMae;
    private Mouse mouse;
    private Teclado teclado;
    private Monitor monitor;
    private Memoria memoria;

    public Computador() {
        this.memoria = new Memoria();
        this.mouse = new Mouse();
        this.teclado = new Teclado();
        this.monitor = new Monitor();
        this.cpu = new CPU(memoria);
        this.placaMae = new PlacaMae(cpu);
    }
}
