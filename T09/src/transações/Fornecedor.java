package transações;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	private String nome;
    private List<Transação> transacoes;

    public Fornecedor(String nome) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }
    
    public void adicionarTransacao(Transação transacao) {
        transacoes.add(transacao);
    }

}
