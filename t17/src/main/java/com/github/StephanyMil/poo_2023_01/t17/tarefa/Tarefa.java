package com.github.StephanyMil.poo_2023_01.t17.tarefa;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    private List<Pagamento> pagamentos;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void realizarPagamentos() {
        System.out.println("Tarefa: " + descricao);

        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}
