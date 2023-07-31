package com.github.StephanyMil.poo_2023_01.t19.circulo.segundo;

public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }
    public void move(Ponto novoCentro, double novoRaio) {
        this.centro = novoCentro;
        this.raio = novoRaio;
    }

    @Override
    public String toString() {
        return "Círculo com centro em " + centro + " e raio " + raio;
    }
}