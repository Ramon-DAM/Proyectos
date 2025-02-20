import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Bola {
    private int numero;                 // Número de bola (>=1)
    @NotNull
    private Color color;                // NO NULO

    public Bola(@NotNull int numero, @NotNull Color color) {
        setNumero(numero);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bola bola = (Bola) o;
        return numero == bola.numero && color.equals(bola.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, color);
    }

    public int getNumero() {
        return numero;
    }

    public @NotNull Color getColor() {
        return color;
    }

    public void setColor(@NotNull Color color) {
        this.color = color;
    }

    public void setNumero(int numero) {
        assert numero>=1: "El número de bola debe ser >=1 [numero=%d]".formatted(numero);
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "(%d %s)".formatted(numero, color);
    }
}
