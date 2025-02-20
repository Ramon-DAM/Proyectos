import org.jetbrains.annotations.NotNull;

public class Casilla {
    private Ficha ficha;

    public Casilla() {
    }

    public void colocar(@NotNull Ficha ficha) {
        this.ficha=ficha;
    }

    public boolean estaVacia() {
        return ficha==null;
    }

    @Override
    public String toString() {
        return "|"+(ficha==null ? " " : ficha)+"|";
    }
}
