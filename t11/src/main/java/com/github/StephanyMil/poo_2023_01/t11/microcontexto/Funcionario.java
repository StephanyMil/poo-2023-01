package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

public class Funcionario {
    private String nome;
    private Lanchonete lanchonete;

    public Funcionario(String nome) {
        this.nome = nome;
        this.lanchonete = null;
    }

    public void definirLanchonete(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }
}
