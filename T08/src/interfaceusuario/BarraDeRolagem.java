package interfaceusuario;

public class BarraDeRolagem extends ElementosDeInteração {
    private int tamanho;

    public BarraDeRolagem(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void destruir() {
    	
        System.out.println("Barra de rolagem destruída. Tamanho: " + tamanho);
    }
}
