package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Compartimento {
    private List<Livro> livros;
    private List<Cd> cds;

    public Compartimento() {
        livros = new ArrayList<>();
        cds = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livros.size() < 3) {
            livros.add(livro);
        }else {
            System.out.println("O compartimento já está cheio de livros.");
        }
    }

    public void adicionarCD(Cd cd) {
        if (cds.size() < 2 || cds.size() > 7) {
            cds.add(cd);
        }else {
            System.out.println("O compartimento já está cheio de CDs.");
        }
    }
}
