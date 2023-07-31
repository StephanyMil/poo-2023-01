package com.github.StephanyMil.poo_2023_01.t19.circulo.primeiro;

public class Circulo {
    private double raio;
    private double x;
    private double y;

    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    @Override
    public String toString() {
        return "Círculo com centro em (" + x + ", " + y + ") e raio " + raio;
    }
}