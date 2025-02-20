package es.iesclaradelrey.dm1d1a;

import es.iesclaradelrey.dm1d1a.clientes.Cliente;
import org.jetbrains.annotations.NotNull;

public class Comprador
    extends Cliente
{
    public Comprador(@NotNull String apodo) {
        super(apodo);
    }

    @Override
    public String toString() {
        return apodo;
    }
}
