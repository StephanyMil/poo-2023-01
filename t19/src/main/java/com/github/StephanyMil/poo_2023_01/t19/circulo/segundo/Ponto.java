package com.github.StephanyMil.poo_2023_01.t19.circulo.segundo;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
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
        return "(" + x + ", " + y + ")";
    }
}