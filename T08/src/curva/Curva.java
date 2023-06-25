package curva;

import java.util.ArrayList;
import java.util.List;

public class Curva {
    private List<Ponto> pontos;

    public Curva() {
        this.pontos = new ArrayList<>();
    }

    public void adicionarPonto(Ponto ponto) {
        pontos.add(ponto);
    }

    public List<Ponto> getPontos() {
        return pontos;
    }
}