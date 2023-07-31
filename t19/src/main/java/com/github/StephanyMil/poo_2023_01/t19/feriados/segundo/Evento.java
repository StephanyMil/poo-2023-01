package com.github.StephanyMil.poo_2023_01.t19.feriados.segundo;

public class Evento {
    private int dia;
    private String descricao;
    private Calendario calendario;

    public Evento(int dia, String descricao) {
        this.dia = dia;
        this.descricao = descricao;
    }

    public int getDia() {
        return dia;
    }

    public String getDescricao() {
        return descricao;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    @Override
    public String toString() {
        return "Dia " + dia + ": " + descricao;
    }
}