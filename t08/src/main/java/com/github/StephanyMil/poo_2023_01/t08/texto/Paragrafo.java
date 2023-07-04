package com.github.StephanyMil.poo_2023_01.t08.texto;

import java.util.List;
import java.util.ArrayList;

public class Paragrafo {
    List<Sentenca> sentencas;

    public Paragrafo() {
        sentencas = new ArrayList<>();
    }

    public void adicionarSentenca(Sentenca sentenca) {
        sentencas.add(sentenca);
    }
}
