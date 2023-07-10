package com.github.StephanyMil.poo_2023_01.t17.tarefa;

public class Trabalhador {
    private String nome;
    private Tarefa tarefa;

    public Trabalhador(String nome, Tarefa tarefa) {
        this.nome = nome;
        this.tarefa = tarefa;
    }

    public void realizarTarefa() {
        System.out.println("Trabalhador: " + nome);
        tarefa.realizarPagamentos();
    }
}
