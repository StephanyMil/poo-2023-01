package com.github.StephanyMil.poo_2023_01.t17.tarefa;

public class Hora extends Pagamento {
    public Hora(double valor) {
        super(valor);
    }

    public void realizarPagamento() {
        System.out.println("Pagamento por hora: R$" + getValor());
    }
}
