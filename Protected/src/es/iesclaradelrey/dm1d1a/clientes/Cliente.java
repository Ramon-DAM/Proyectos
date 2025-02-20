package es.iesclaradelrey.dm1d1a.clientes;

import org.jetbrains.annotations.NotNull;

public class Cliente {
    protected String apodo;     // NO NULO

    public Cliente(@NotNull String apodo) {
        this.apodo = apodo;
    }
}
