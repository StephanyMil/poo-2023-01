package escola;

public class Escola {
	private String nome;
	private int capacidadeAlunos;
	private Endereco endereco;
	
	public Escola(String nome, int capacidadeAlunos, Endereco endereco) {
		this.nome = nome;
		this.capacidadeAlunos = capacidadeAlunos;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCapacidadeAlunos() {
		return capacidadeAlunos;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public static void main(String[] args) {
        Endereco enderecoEscola = new Endereco("Av.Esperança", "74690-900", "Goiânia", "Goiás");
        Escola escola = new Escola("Universidade Federal de Goiás", 5000, enderecoEscola);

        System.out.println("Nome da escola: " + escola.getNome());
        System.out.println("Capacidade de alunos: " + escola.getCapacidadeAlunos());
        System.out.println("Endereço da escola:");
        System.out.println("Logradouro: " + escola.getEndereco().getLogradouro());
        System.out.println("CEP: " + escola.getEndereco().getCep());
        System.out.println("Cidade: " + escola.getEndereco().getCidade());
        System.out.println("Estado: " + escola.getEndereco().getEstado());
    }

}
