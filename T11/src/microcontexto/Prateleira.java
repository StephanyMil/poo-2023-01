package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
	private List<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }

}
