package viajante;

public class Armazém {
	private String nome;
    private ListaPedidos listaPedidos;

    public Armazém(String nome) {
        this.nome = nome;
        listaPedidos = new ListaPedidos();
    }

}
