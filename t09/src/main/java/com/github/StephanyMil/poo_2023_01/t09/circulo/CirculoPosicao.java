package com.github.StephanyMil.poo_2023_01.t09.circulo;

public class CirculoPosicao {
    private float x;
    private float y;
    private double raio;

    public CirculoPosicao(float x, float y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public void transladar(float deslocamentoX, float deslocamentoY) {
        x += deslocamentoX;
        y += deslocamentoY;
    }

}
