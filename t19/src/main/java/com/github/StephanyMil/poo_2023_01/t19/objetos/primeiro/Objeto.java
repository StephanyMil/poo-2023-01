package com.github.StephanyMil.poo_2023_01.t19.objetos.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Objeto {
    private String nome;
    private List<Objeto> mensagensEnviadas;

    public Objeto(String nome) {
        this.nome = nome;
        this.mensagensEnviadas = new ArrayList<>();
    }

    public void enviarMensagemPara(Objeto destinatario) {
        mensagensEnviadas.add(destinatario);
    }

    public List<Objeto> getMensagensEnviadas() {
        return mensagensEnviadas;
    }
}