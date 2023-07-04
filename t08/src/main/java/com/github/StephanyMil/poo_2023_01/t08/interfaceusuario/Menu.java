package com.github.StephanyMil.poo_2023_01.t08.interfaceusuario;

import java.util.List;

public class Menu extends ElementosDeInteracao {
    private String titulo;
    private List<String> itens;

    public Menu(String titulo, List<String> itens) {
        this.titulo = titulo;
        this.itens = itens;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getItens() {
        return itens;
    }

    public void destruir() {

        System.out.println("Menu destruído: " + titulo);
    }
}