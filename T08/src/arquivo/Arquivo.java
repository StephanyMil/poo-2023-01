package arquivo;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private List<Permissão> permissoes;

    public Arquivo() {
        this.permissoes = new ArrayList<>();
    }

    public void adicionarPermissao(Permissão permissao) {
        permissoes.add(permissao);
    }

    public List<Permissão> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissão> permissoes) {
        this.permissoes = permissoes;
    }
}