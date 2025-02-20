import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Mascota {
    @NotNull
    private String apodo;   // NO NULO

    public Mascota(@NotNull String apodo) {
        this.apodo = apodo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return Objects.equals(apodo, mascota.apodo);
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
