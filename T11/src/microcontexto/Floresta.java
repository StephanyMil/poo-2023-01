package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Floresta {
	private List<Árvore> árvores;

    public Floresta() {
        árvores = new ArrayList<>();
    }

    public void adicionarÁrvore(Árvore árvore) {
        árvores.add(árvore);
    }

    public List<Árvore> getÁrvores() {
        return árvores;
    }

}
