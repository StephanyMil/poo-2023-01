package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private List<Funcionario> funcionarios;
    private Funcionario gerente;

    public Lanchonete() {
        funcionarios = new ArrayList<>();
        gerente = null;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void definirGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

}
