package com.github.StephanyMil.poo_2023_01.t17.automovel;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private Pessoa motoristaAtual;

    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motoristaAtual = null;
    }
}
