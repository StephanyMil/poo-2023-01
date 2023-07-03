package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Árvore {
	private List<Folha> folhas;

    public Árvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }

    public List<Folha> getFolhas() {
        return folhas;
    }

}
