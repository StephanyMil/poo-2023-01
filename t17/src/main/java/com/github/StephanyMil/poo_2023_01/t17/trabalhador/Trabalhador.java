package com.github.StephanyMil.poo_2023_01.t17.trabalhador;

public class Trabalhador {
    private Profissao profissao;

    public Trabalhador(Profissao profissao) {
        this.profissao = profissao;
    }

    public void desempenharProfissao() {
        profissao.executar();
    }
}
