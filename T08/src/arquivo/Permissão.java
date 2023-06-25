package arquivo;

public class Permissão {
	private Grupo grupo;
    private Arquivo arquivo;

    public Permissão(Grupo grupo, Arquivo arquivo) {
        this.grupo = grupo;
        this.arquivo = arquivo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
}
