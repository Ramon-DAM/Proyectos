import java.util.Objects;

public class Nodo {
    private int e;
    private Nodo sgte;

    public Nodo(int e) {
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return e == nodo.e;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(e);
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    @Override
    public String toString() {
        return "[%d]".formatted(e);
    }
}
