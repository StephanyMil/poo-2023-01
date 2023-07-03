package microcontexto;

public class Funcionário {
	private String nome;
    private Lanchonete lanchonete;

    public Funcionário(String nome) {
        this.nome = nome;
        this.lanchonete = null;
    }

    public void definirLanchonete(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

}
