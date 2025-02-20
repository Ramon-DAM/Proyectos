import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

/**
 * Esta clase representa animales
 */
public class Animal
    implements Comparable<Animal> {
    @NotNull
    private String apodo;       // NO NULO
    private int peso;           // >=0, Kg
    @NotNull
    private Pelaje pelaje;      // NO NULO

    /**
     * Animal
     *
     * @param apodo     Apodo del animal
     * @param peso      Peso del animal en Kg
     * @param pelaje    Pelaje del animal
     */
    public Animal(@NotNull String apodo, int peso, @NotNull Pelaje pelaje) {
        this.apodo = apodo;
        this.peso = peso;
        this.pelaje = pelaje;
    }

    /**
     * Compareto
     *
     * @param o     Objeto animal con el que comparar el actual
     * @return      <pre>
     *      &gt;0   Si el apodo del animal precede al apodo del animal o
     *      0       Si los dos animales don iguales (según su apodo)
     *      &lt;0   Si el apodo del animal sucede al apodo del animal o
     * </pre>
     *
     */
    @Override
    public int compareTo(@NotNull Animal o) {
       return apodo.compareTo(o.apodo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(apodo, animal.apodo);
    }

    public String getApodo() {
        return apodo;
    }

    public Pelaje getPelaje() {
        return pelaje;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(apodo);
    }

    @Override
    public String toString() {
        return "%s [pelaje %s] [%d Kg]".formatted(apodo, pelaje, peso);
    }
}
