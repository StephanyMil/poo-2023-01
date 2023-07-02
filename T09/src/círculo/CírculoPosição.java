package círculo;

public class CírculoPosição {
	private float x;
	private float y;
	private double raio;
	
	public CírculoPosição(float x, float y, double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	public void transladar(float deslocamentoX, float deslocamentoY) {
		x += deslocamentoX;
		y += deslocamentoY;
	}

}
