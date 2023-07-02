package círculo;

public class Ponto {
	private float x;
	private float y;
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	 public float getX() {
	        return x;
	}

	 public float getY() {
	        return y;
	}
	    
	 public void transladar(float deslocamentoX, float deslocamentoY) {
			x += deslocamentoX;
			y += deslocamentoY;
    }

}
