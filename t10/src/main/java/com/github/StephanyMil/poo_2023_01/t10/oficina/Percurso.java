package com.github.StephanyMil.poo_2023_01.t10.oficina;

public class Percurso {
    private String localPartida;
    private String localChegada;
    private double distancia;
    private String nivelDificuldade;
    private float duracao; // min
    private String rota;

    public Percurso(String localPartida, String localChegada, double distancia, String nivelDificuldade, float duracao, String rota) {
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.distancia = distancia;
        this.nivelDificuldade = nivelDificuldade;
        this.duracao = duracao;
        this.rota = rota;
    }
}
