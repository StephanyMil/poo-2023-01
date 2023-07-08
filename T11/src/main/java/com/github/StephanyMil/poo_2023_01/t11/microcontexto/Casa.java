package com.github.StephanyMil.poo_2023_01.t11.microcontexto;

import java.util.ArrayList;
import java.util.List;
public class Casa {
    private List<Quarto> quartos;
    private List<Banheiro> banheiros;
    private List<Sala> salas;
    private List<Area> areas;
    private List<Garagem> garagens;

    public Casa() {
        quartos = new ArrayList<>();
        banheiros = new ArrayList<>();
        salas = new ArrayList<>();
        areas = new ArrayList<>();
        garagens = new ArrayList<>();
    }
}
