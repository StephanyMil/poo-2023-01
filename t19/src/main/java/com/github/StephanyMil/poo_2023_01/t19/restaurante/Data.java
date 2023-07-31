package com.github.StephanyMil.poo_2023_01.t19.restaurante;

import java.time.LocalDateTime;

public class Data {
    private Mesa mesa;
    private Pessoa pessoa;
    private LocalDateTime dataOcupacao;

    public Data(Mesa mesa, Pessoa pessoa, LocalDateTime dataOcupacao) {
        this.mesa = mesa;
        this.pessoa = pessoa;
        this.dataOcupacao = dataOcupacao;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public LocalDateTime getDataOcupacao() {
        return dataOcupacao;
    }

    @Override
    public String toString() {
        return pessoa + " ocupou a " + mesa + " em " + dataOcupacao;
    }
}