package hábitos;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {
	 private String nome;
	    private int idade;
	    private List<Hábito> habitos;

	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	        this.habitos = new ArrayList<>();
	    }

}
