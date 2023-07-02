package transações;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
	private String nome;
    private List<Transação> transacoes;

    public Cliente(String nome) {
        this.nome = nome;
        transacoes = new ArrayList<>();
    }
    
    public void adicionarTransacao(Transação transacao) {
        transacoes.add(transacao);
    }

}
