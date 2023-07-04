package com.github.StephanyMil.poo_2023_01.t08.pais;

import com.github.StephanyMil.poo_2023_01.t08.interfaceusuario.Cidade;

public class Capital {
    private Cidade cidade;

    public Capital(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}