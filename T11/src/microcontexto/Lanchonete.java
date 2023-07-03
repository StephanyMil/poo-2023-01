package microcontexto;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
	private List<Funcionário> funcionarios;
    private Funcionário gerente;

    public Lanchonete() {
        funcionarios = new ArrayList<>();
        gerente = null;
    }

    public void adicionarFuncionario(Funcionário funcionario) {
        funcionarios.add(funcionario);
    }

    public void definirGerente(Funcionário gerente) {
        this.gerente = gerente;
    }

}
