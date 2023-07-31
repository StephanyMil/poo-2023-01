package com.github.StephanyMil.poo_2023_01.t19.associacoes.associacao;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Pessoa pessoa;

    public Usuario(String nomeUsuario, String senha, String email, Pessoa pessoa) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.pessoa = pessoa;
    }
}