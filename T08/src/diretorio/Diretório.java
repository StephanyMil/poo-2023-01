package diretorio;

import java.util.ArrayList;
import java.util.List;

public class Diretório {
	private String nome;
    private Usuário dono;
    private List<Usuário> usuariosAutorizados;

    public Diretório(String nome, Usuário dono) {
        this.nome = nome;
        this.dono = dono;
        this.usuariosAutorizados = new ArrayList<>();
    }
}
