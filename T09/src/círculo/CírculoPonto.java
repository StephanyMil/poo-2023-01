package círculo;

public class CírculoPonto {
	private Ponto centro;
    private double raio;

    public CírculoPonto(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }
    
    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }
    
    public void transladar(float deslocamentoX, float deslocamentoY) {
        centro = new Ponto(centro.getX() + deslocamentoX, centro.getY() + deslocamentoY);
    }

}
