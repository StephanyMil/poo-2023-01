package com.github.StephanyMil.poo_2023_01.t09.mamifero;

public class Mamifero {
    private String especie;
    private String genero;
    private int idade;

    public Mamifero(String especie, String genero, int idade) {
        this.especie = especie;
        this.genero = genero;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }
}
