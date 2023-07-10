package com.github.StephanyMil.poo_2023_01.t17.festa;

public class Danca {
    private String nome;
    private Musica musica;
    private String horaInicio;
    private String horaFim;

    public Danca(String nome, Musica musica, String horaInicio, String horaFim) {
        this.nome = nome;
        this.musica = musica;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getNome() {
        return nome;
    }

    public Musica getMusica() {
        return musica;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }
}
