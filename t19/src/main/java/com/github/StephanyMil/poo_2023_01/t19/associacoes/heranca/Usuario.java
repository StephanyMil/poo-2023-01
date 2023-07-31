package com.github.StephanyMil.poo_2023_01.t19.associacoes.heranca;

public class Usuario extends Pessoa {
    private String nomeUsuario;
    private String senha;
    private String email;

    public Usuario(String nomeCompleto, int idade, String endereco, String nomeUsuario, String senha, String email) {
        super(nomeCompleto, idade, endereco); // Chama o construtor da classe Pessoa
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
    }
}