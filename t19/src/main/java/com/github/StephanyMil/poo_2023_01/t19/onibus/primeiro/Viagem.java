package com.github.StephanyMil.poo_2023_01.t19.onibus.primeiro;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private List<Passageiro> passageiros;

    public Viagem() {
        passageiros = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
}