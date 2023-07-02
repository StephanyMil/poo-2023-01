package contêiner;

import java.util.ArrayList;
import java.util.List;

public class Contêiner extends Elemento {
	private List<Elemento> conteineres;
	
	public Contêiner(String numeracao) {
		super(numeracao);
		conteineres = new ArrayList<>();
	}
	
	public void adicionarConteiner(Elemento conteiner) {
		conteineres.add(conteiner);
	}
	
	 public List<Elemento> getElementos() {
	        return conteineres;
	    }

}
