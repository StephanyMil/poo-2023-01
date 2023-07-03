package microcontexto;

import java.time.LocalDate;

public class Prestação {
	private double valor;
    private LocalDate dataLimite;

    public Prestação(double valor, LocalDate dataLimite) {
        this.valor = valor;
        this.dataLimite = dataLimite;
    }

}
