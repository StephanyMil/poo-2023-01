package com.github.StephanyMil.poo_2023_01.t17.tarefa;

public class Contrato extends Pagamento {
    public Contrato(double valor) {
        super(valor);
    }

    public void realizarPagamento() {
        System.out.println("Pagamento por contrato: R$" + getValor());
    }
}
