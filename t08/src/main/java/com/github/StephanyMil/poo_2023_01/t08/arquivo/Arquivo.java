package com.github.StephanyMil.poo_2023_01.t08.arquivo;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private List<Permissao> permissoes;

    public Arquivo() {
        this.permissoes = new ArrayList<>();
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}
