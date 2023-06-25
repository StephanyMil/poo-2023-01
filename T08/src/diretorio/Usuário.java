package diretorio;

import java.util.ArrayList;
import java.util.List;

public class Usuário {
	private String nome;
    private List<Diretório> diretorios;

    public Usuário(String nome) {
        this.nome = nome;
        this.diretorios = new ArrayList<>();
    }
}
