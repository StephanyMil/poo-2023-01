package arquivo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private List<Usuário> usuarios;

    public Grupo() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuário usuario) {
        usuarios.add(usuario);
    }

    public List<Usuário> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuário> usuarios) {
        this.usuarios = usuarios;
    }

}
