package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Pessoa> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void contratarEmpregado(Pessoa empregado) {
        empregados.add(empregado);
    }

    public List<Pessoa> getEmpregados() {
        return empregados;
    }
}