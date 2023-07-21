package com.github.StephanyMil.poo_2023_01.t08.interfaceusuario;

public class BarraDeRolagem extends ElementosDeInteracao {
    private int tamanho;

    public BarraDeRolagem(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void destruir() {
        System.out.println("Barra de rolagem destruída. Tamanho: " + tamanho);
    }
}
