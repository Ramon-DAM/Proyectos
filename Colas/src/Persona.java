import org.jetbrains.annotations.NotNull;

public class Persona {
    @NotNull
    private String apodo;       // NO NULO

    public Persona(@NotNull String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return apodo;
    }
}
