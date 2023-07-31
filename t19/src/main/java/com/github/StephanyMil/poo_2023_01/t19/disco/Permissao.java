package com.github.StephanyMil.poo_2023_01.t19.disco;

public class Permissao {
    private Arquivo arquivo;
    private Usuario usuario;
    private boolean leitura;
    private boolean escrita;
    private boolean execução;

    public Permissao(Arquivo arquivo, Usuario usuario, boolean leitura, boolean escrita, boolean execução) {
        this.arquivo = arquivo;
        this.usuario = usuario;
        this.leitura = leitura;
        this.escrita = escrita;
        this.execução = execução;
    }
}