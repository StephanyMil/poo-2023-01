package com.github.StephanyMil.poo_2023_01.t08.pais;

public class Cidade {
    private String nome;
    private String sigla;
    private String Cep;
    private Pais pais;

    public Cidade(String nome, String sigla, String Cep, Pais pais) {
        this.nome = nome;
        this.sigla = sigla;
        this.Cep = Cep;
        this.pais = pais;
        pais.adicionarCidade(this);
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCep() {
        return Cep;
    }

    public Pais getPais() {
        return pais;
    }
}
