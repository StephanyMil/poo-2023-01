package com.github.StephanyMil.poo_2023_01.t19.feriados.segundo;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private int ano;
    private List<Evento> eventos;

    public Calendario(int ano) {
        this.ano = ano;
        this.eventos = new ArrayList<>();
    }

    public int getAno() {
        return ano;
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
        evento.setCalendario(this);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}