import org.jetbrains.annotations.NotNull;

public class Coche {
    private Matricula matricula;    // NO NULO

    public Coche(Matricula matricula) {
        setMatricula(matricula);
    }

    public void setMatricula(@NotNull Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula=" + matricula +
                '}';
    }
}
