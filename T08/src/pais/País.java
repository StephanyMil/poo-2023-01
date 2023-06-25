package pais;

import java.util.ArrayList;
import java.util.List;

public class País {
	private String nome;
    private Capital capital;
    private List<Cidade> cidades;

    public País(String nome, Capital capital) {
        this.nome = nome;
        this.capital = capital;
        this.cidades = new ArrayList<>();
        adicionarCidade(capital.getCidade());
    }

    public String getNome() {
        return nome;
    }
    
    public Capital getCapital() {
        return capital;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void adicionarCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public void removerCidade(Cidade cidade) {
        cidades.remove(cidade);
    }
}