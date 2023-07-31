package com.github.StephanyMil.poo_2023_01.t19.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private List<Data> datas;

    public Mesa(int numero) {
        this.numero = numero;
        datas = new ArrayList<>();
    }

    public void adicionarData(Data data) {
        datas.add(data);
    }

    public List<Data> getData() {
        return datas;
    }

    @Override
    public String toString() {
        return "Mesa " + numero;
    }
}