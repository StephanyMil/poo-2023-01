package com.github.StephanyMil.poo_2023_01.t19.feriados.primeiro;

import java.util.HashMap;
import java.util.Map;

public class Calendario {
    private int ano;
    private Map<Integer, Dia> dias;

    public Calendario(int ano) {
        this.ano = ano;
        this.dias = new HashMap<>();
    }

    public int getAno() {
        return ano;
    }

    public void adicionarDia(int dia, Dia infoDia) {
        dias.put(dia, infoDia);
    }

    public Dia getDia(int dia) {
        return dias.getOrDefault(dia, new Dia(false, false));
    }
}