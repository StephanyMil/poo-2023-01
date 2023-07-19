package com.github.StephanyMil.poo_2023_01.t08.arquivo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Usuario> usuarios;

    public Grupo() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
