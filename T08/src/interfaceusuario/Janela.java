package interfaceusuario;

import java.util.ArrayList;
import java.util.List;

public class Janela {
    private List<ElementosDeInteração> elementos;

    public Janela() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(ElementosDeInteração elemento) {
        elementos.add(elemento);
    }

    public void destruir() {
        
        for (ElementosDeInteração elemento : elementos) {
            elemento.destruir();
        }
    }
}