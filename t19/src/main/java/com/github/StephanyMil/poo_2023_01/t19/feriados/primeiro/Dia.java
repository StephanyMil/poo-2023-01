package com.github.StephanyMil.poo_2023_01.t19.feriados.primeiro;

public class Dia {
    private boolean ehFeriado;
    private boolean ehDataImportante;

    public Dia(boolean ehFeriado, boolean ehDataImportante) {
        this.ehFeriado = ehFeriado;
        this.ehDataImportante = ehDataImportante;
    }

    public boolean isEhFeriado() {
        return ehFeriado;
    }

    public boolean isEhDataImportante() {
        return ehDataImportante;
    }
}