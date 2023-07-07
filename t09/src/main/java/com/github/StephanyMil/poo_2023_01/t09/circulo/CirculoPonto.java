package com.github.StephanyMil.poo_2023_01.t09.circulo;

public class CirculoPonto {
    private Ponto centro;
    private double raio;

    public CirculoPonto(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void transladar(float deslocamentoX, float deslocamentoY) {
        centro = new Ponto(centro.getX() + deslocamentoX, centro.getY() + deslocamentoY);
    }
}
