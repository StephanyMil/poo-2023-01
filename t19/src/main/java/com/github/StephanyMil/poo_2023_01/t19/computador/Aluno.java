package com.github.StephanyMil.poo_2023_01.t19.computador;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Computador computadorUFG;
    private List<Computador> computadoresDomicilio;

    public Aluno(String nome) {
        this.nome = nome;
        this.computadoresDomicilio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Computador getComputadorUFG() {
        return computadorUFG;
    }

    public void setComputadorUFG(Computador computadorUFG) {
        this.computadorUFG = computadorUFG;
    }

    public List<Computador> getComputadoresDomicilio() {
        return computadoresDomicilio;
    }

    public void adicionarComputadorDomicilio(Computador computador) {
        computadoresDomicilio.add(computador);
    }
}