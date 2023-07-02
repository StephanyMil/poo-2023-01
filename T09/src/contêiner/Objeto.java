package contêiner;

public class Objeto extends Elemento {
	private String descricao;

    public Objeto(String numeracao, String descricao) {
        super(numeracao);
        this.descricao = descricao;
    }

}
