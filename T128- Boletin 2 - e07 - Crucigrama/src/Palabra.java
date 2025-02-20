import org.jetbrains.annotations.NotNull;

public class Palabra {
    @NotNull
    private String letras;      // NO NULO

    public Palabra(@NotNull String letras) {
        this.letras = letras;
    }

    public @NotNull String getLetras() {
        return letras;
    }

    @Override
    public String toString() {
        return letras;
    }
}
