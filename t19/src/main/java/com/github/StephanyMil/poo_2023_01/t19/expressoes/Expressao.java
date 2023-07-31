package com.github.StephanyMil.poo_2023_01.t19.expressoes;

import java.util.ArrayList;
import java.util.List;

public class Expressao {
    private List<Elemento> elementos;

    public Expressao() {
        elementos = new ArrayList<>();
    }

    public void adicionarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public double avaliar() {
        double resultado = 0;
        for (Elemento elemento : elementos) {
            resultado = elemento.avaliar();
        }
        return resultado;
    }
}