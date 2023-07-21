package com.github.StephanyMil.poo_2023_01.t17.aeroporto;

import java.time.LocalTime;
import java.time.LocalDate;

public class Operacao {
    private String tipo;
    private LocalDate data;
    private LocalTime hora;
    private Aeroporto aeroporto;

    public Operacao(String tipo, LocalDate data, LocalTime hora, Aeroporto aeroporto) {
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.aeroporto = aeroporto;
    }
}
