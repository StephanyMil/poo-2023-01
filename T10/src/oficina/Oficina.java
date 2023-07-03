package oficina;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
	 private String nome;
	 private String endereco;
	 private List<Empreendedor> empreendedores;
	 private List<Cliente> clientes;
	 private List<Percurso> percursos;
	 private List<Conserto> consertos;

	 public Oficina(String nome, String endereco) {
	     this.nome = nome;
	     this.endereco = endereco;
         this.empreendedores = new ArrayList<>();
	     this.clientes = new ArrayList<>();
	     this.percursos = new ArrayList<>();
	     this.consertos = new ArrayList<>();
	    }

}
