package pais;

public class Capital {
	private Cidade cidade;

    public Capital(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
