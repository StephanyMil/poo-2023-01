package interfaceusuario;

import java.util.List;

public class Menu extends ElementosDeInteração {
    private String titulo;
    private List<String> itens;

    public Menu(String titulo, List<String> itens) {
        this.titulo = titulo;
        this.itens = itens;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getItens() {
        return itens;
    }

    @Override
    public void destruir() {
       
        System.out.println("Menu destruído: " + titulo);
    }
}
