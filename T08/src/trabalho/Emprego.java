package trabalho;

import java.time.LocalDate;

public class Emprego {
    private Pessoa empregado;
    private Empresa empregador;
    private double salario;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Emprego(Pessoa empregado, Empresa empregador, double salario, LocalDate dataInicio) {
        this.empregado = empregado;
        this.empregador = empregador;
        this.salario = salario;
        this.dataInicio = dataInicio;
    }

    public Pessoa getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Pessoa empregado) {
        this.empregado = empregado;
    }

    public Empresa getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Empresa empregador) {
        this.empregador = empregador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
