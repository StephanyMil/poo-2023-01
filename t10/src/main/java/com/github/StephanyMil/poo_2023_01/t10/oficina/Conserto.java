package com.github.StephanyMil.poo_2023_01.t10.oficina;

import java.util.ArrayList;
import java.util.List;

public class Conserto {
    private String tipo;
    private String descricao;
    private double preco;
    List<String> peças;

    public Conserto(String tipo, String descricao, double preco) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.peças = new ArrayList<>();
    }

}