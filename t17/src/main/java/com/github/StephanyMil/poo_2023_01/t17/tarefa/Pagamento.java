package com.github.StephanyMil.poo_2023_01.t17.tarefa;

abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract void realizarPagamento();
}
