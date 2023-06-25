package interfaceusuario;

public class Botão extends ElementosDeInteração{
	private String texto;

    public Botão(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void destruir() {
        System.out.println("Botão destruído: " + texto);
    }

}
