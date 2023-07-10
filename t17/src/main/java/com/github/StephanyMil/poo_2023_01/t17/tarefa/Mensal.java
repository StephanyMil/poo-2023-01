package com.github.StephanyMil.poo_2023_01.t17.tarefa;

public class Mensal extends Pagamento {
    public Mensal(double valor) {
        super(valor);
    }

    public void realizarPagamento() {
        System.out.println("Pagamento mensal: R$" + getValor());
    }
}
