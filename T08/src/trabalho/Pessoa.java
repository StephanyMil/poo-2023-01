package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Empresa> empresas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.empresas = new ArrayList<>();
    }

    public void adicionarEmprego(Empresa emprego) {
        empresas.add(emprego);
    }

    public void removerEmprego(Empresa emprego) {
        empresas.remove(emprego);
    }

    public List<Empresa> getEmpregos() {
        return empresas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
