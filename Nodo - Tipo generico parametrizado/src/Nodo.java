import org.jetbrains.annotations.NotNull;

public class Nodo<E> {
    private E e;
    private Nodo<E> sgte;

    public Nodo(@NotNull E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Nodo<E> getSgte() {
        return sgte;
    }

    public void setSgte(Nodo<E> sgte) {
        this.sgte = sgte;
    }

    @Override
    public String toString() {
        return "[%s]".formatted(e);
    }
}
