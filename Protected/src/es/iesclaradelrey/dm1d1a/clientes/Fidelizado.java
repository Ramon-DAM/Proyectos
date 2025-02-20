package es.iesclaradelrey.dm1d1a.clientes;

import org.jetbrains.annotations.NotNull;

public class Fidelizado
    extends Cliente
{
    protected Tarjeta tarjeta;      // NO NULO

    public Fidelizado(@NotNull String apodo, @NotNull Tarjeta tarjeta) {
        super(apodo);
        this.tarjeta=tarjeta;
    }

    @Override
    public String toString() {
        return "%s [%s]".formatted(apodo, tarjeta);
    }
}
