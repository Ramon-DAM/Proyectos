import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Persona {
    @NotNull
    private String apodo;       // NO NULO

    public Persona(@NotNull String apodo) {
        this.apodo = apodo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(apodo, persona.apodo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(apodo);
    }

    @Override
    public String toString() {
        return apodo;
    }
}
