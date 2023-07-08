package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.time.LocalDate;

public class Prestacao {
    private double valor;
    private LocalDate dataLimite;

    public Prestacao(double valor, LocalDate dataLimite) {
        this.valor = valor;
        this.dataLimite = dataLimite;
    }

}
