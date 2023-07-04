package com.github.StephanyMil.poo_2023_01.t08.projeto;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Pessoa> pessoas;

    public Projeto(String nome) {
        this.nome = nome;
        this.pessoas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
}
