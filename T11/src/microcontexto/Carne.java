package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Carne {
	private Compra compra;
    private List<Prestação> prestacoes;

    public Carne(Compra compra) {
        this.compra = compra;
        this.prestacoes = new ArrayList<>();
    }

    public void adicionarPrestacao(Prestação prestacao) {
        prestacoes.add(prestacao);
    }

}
