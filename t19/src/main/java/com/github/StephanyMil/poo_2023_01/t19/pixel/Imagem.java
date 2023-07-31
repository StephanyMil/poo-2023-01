package com.github.StephanyMil.poo_2023_01.t19.pixel;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private int largura;
    private int altura;
    private List<Pixel> pixels;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        this.pixels = new ArrayList<>();
    }

    public void adicionarPixel(Pixel pixel) {
        pixels.add(pixel);
    }
}