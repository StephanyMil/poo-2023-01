package viajante;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
	 private List<Cidade> cidades;

	 public Viagem() {
	        cidades = new ArrayList<>();
	 }

	 public void adicionarCidade(Cidade cidade) {
	        cidades.add(cidade);
	 }

}
