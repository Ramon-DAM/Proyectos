import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Animal {
    @NotNull
    private String apodo;       // NO NULO

    public Animal(@NotNull String apodo) {
        this.apodo = apodo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(apodo, animal.apodo);
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
