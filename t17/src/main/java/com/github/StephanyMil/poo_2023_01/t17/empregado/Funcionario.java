package com.github.StephanyMil.poo_2023_01.t17.empregado;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private Funcionario gerente;
    private List<Funcionario> funcionarios;

    public Funcionario(String nome, Funcionario gerente) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
