package com.github.StephanyMil.poo_2023_01.t07.festa;

import java.util.TreeSet;

public class Festa{
    private TreeSet convidados = new TreeSet();

    public void novoConvidado(Convidado c){
        convidados.add(c);
    }

    public Festa(Convidado c){
        convidados.add(c);
    }
}