package pais;

public class Cidade {
    private String nome;
    private String sigla;
    private String Cep;
    private País país;

    public Cidade(String nome, String sigla, String Cep, País país) {
        this.nome = nome;
        this.sigla = sigla;
        this.Cep = Cep;
        this.país = país;
        país.adicionarCidade(this);
    }

    public String getNome() {
        return nome;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public String getCep() {
        return Cep;
    }

    public País getPaís() {
        return país;
    }
}