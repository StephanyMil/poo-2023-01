package com.github.StephanyMil.poo_2023_01.t19.revisao;

public class Versao {
    private String numero;

    public Versao(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Versão " + numero;
    }
}