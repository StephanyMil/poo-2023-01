package projetos;

import java.util.ArrayList;
import java.util.List;

public class ProjetoSoftware {
	private List<String> LinguagensProgramacao;
	
	public ProjetoSoftware() {
		LinguagensProgramacao = new ArrayList<>();
	}
	public void addLinguagensProgramacao(String linguagem) {
		LinguagensProgramacao.add(linguagem);
	}
	public List<String> getLinguagensProgramacao(){
		return LinguagensProgramacao;
	}
	public static void main(String[] args) {
		ProjetoSoftware projeto = new ProjetoSoftware();
		
		projeto.addLinguagensProgramacao("Java");
		
		List<String> linguagens = projeto.getLinguagensProgramacao();
		
		System.out.println("Linguagem de programação do projeto:");
		for(String linguagem : linguagens) {
		   System.out.println(linguagem);
		}
	}
}
