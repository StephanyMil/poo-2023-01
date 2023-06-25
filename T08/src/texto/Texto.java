package texto;

import java.util.ArrayList;

public class Texto {
	ArrayList<Paragrafo> paragrafos;
	
	public Texto() {
		paragrafos = new ArrayList<>();
	}
	
	public void adicionarParagrafo(Paragrafo paragrafo) {
	    paragrafos.add(paragrafo);
	}
}
