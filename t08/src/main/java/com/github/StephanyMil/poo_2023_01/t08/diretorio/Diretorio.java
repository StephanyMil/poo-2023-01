package com.github.StephanyMil.poo_2023_01.t08.diretorio;

import java.util.ArrayList;
import java.util.List;
public class Diretorio {
    private String nome;
    private Usuario dono;
    private List<Usuario> usuariosAutorizados;

    public Diretorio(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
        this.usuariosAutorizados = new ArrayList<>();
    }
}
