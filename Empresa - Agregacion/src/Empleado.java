import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Empleado {
    @NotNull
    private String apodo;       // NO BLANCO, NO MODIFICABLE

    public Empleado(@NotNull String apodo) {
        setApodo(apodo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(apodo, empleado.apodo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(apodo);
    }

    private void setApodo(@NotNull String apodo) {
        assert !apodo.isBlank(): "El apodo no puede estar en blanco [apodo=%s]".formatted(apodo);
        this.apodo=apodo;
    }

    @Override
    public String toString() {
        return apodo;
    }
}
