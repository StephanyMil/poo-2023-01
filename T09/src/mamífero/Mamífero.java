package mamífero;

public class Mamífero {
	private String especie;
	private String genero;
    private int idade;

    public Mamífero(String especie, String genero, int idade) {
        this.especie = especie;
        this.genero = genero;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }
    
    public String getGenero() {
    	return genero;
    }

    public int getIdade() {
        return idade;
    }

}
