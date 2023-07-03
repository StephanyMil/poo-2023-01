package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Armário {
	private List<Prateleira> prateleiras;

    public Armário() {
        prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }

}
