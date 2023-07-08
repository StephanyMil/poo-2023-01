package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

public class JanelaComVidro extends Janela {
    private float areaVidro;

    public JanelaComVidro(float area, float areaVidro) {
        super(area);
        this.areaVidro = areaVidro;
    }

    public float getAreaVidro() {
        return areaVidro;
    }

    public void setAreaVidro(float areaVidro) {
        this.areaVidro = areaVidro;
    }

    public float getAreaRestante() {
        return getArea() - areaVidro;
    }

}
