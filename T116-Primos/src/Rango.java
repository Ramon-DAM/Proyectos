// a debe ser >b
public class Rango {
    private int a;
    private int b;

    public Rango(int a, int b) {
        setAB(a,b);
    }

    // Devuelve true si x está en el rango [a,b]
    public boolean en(int x) {
        return x>=a && x<=b;
    }

    private void setAB(int a, int b) {
        assert a>b: "El extremo izquierdo del rango debe ser > que el derecho [%d,%d]"
            .formatted(a,b);
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "[%d,%d]".formatted(a,b);
    }
}
