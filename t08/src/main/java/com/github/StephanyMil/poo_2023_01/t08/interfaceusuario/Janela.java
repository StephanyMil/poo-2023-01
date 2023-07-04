package com.github.StephanyMil.poo_2023_01.t08.interfaceusuario;

import java.util.ArrayList;
import java.util.List;

public class Janela {
    private List<ElementosDeInteracao> elementos;

    public Janela() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(ElementosDeInteracao elemento) {
        elementos.add(elemento);
    }

    public void destruir() {

        for (ElementosDeInteracao elemento : elementos) {
            elemento.destruir();
        }
    }
}
