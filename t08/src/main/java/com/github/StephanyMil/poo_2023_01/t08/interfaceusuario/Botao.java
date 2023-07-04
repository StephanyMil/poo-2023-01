package com.github.StephanyMil.poo_2023_01.t08.interfaceusuario;

public class Botao extends ElementosDeInteracao{
    private String texto;

    public Botao(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void destruir() {
        System.out.println("Botão destruído: " + texto);
    }

}
