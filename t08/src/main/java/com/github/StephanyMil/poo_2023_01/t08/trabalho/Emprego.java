package com.github.StephanyMil.poo_2023_01.t08.trabalho;

import java.time.LocalDate;

public class Emprego {
    private Pessoa empregado;
    private Empresa empregador;
    private double salario;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Emprego(Pessoa empregado, Empresa empregador, double salario, LocalDate dataInicio) {
        this.empregado = empregado;
        this.empregador = empregador;
        this.salario = salario;
        this.dataInicio = dataInicio;
    }

}
