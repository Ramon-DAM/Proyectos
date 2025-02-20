package es.iesclaradelrey.dm1d1a.clientes;

import org.jetbrains.annotations.NotNull;

public class Cliente {
    private String apodo;     // NO NULO

    public Cliente(@NotNull String apodo) {
        this.apodo = apodo;
    }

    protected String getApodo() {
        return apodo;
    }
}
