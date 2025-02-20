import org.jetbrains.annotations.NotNull;

public abstract class Figura {
    @NotNull
    private Color color;        // NO NULO
    @NotNull
    private Punto centro;      // NO NULO

    public Figura(@NotNull Color color) {
        this.color = color;
        this.centro = new Punto(0,0);
    }

    public abstract double area();
    public abstract void dibujar();

    public void mover(int distancia, @NotNull Orientacion orientacion) {
        assert distancia>=0:
            "La distancia para mover una figura debe ser >=0 [distancia=%d]".formatted(distancia);
        // TODO (ebarrab - 19-02-2025): Esto lo hacen mis queridos alumnos
    }

    @Override
    public String toString() {
        return "%s [%s] %s".formatted(getClass().getSimpleName(), color, centro);
    }
}
