import org.jetbrains.annotations.NotNull;

public class Triangulo
    extends Figura
{
    private int base;       // >=0
    private int altura;     // >=0

    public Triangulo(@NotNull Color color, int base, int altura) {
        super(color);
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double area() {
        return (base*altura)/2.0;
    }

    @Override
    public void dibujar() {
        // TODO (ebarrab - 19-02-2025): mis alumn@s dibujan el triángulo mejor que yo
        System.out.println("Soy un triángulo");
    }

    private void setAltura(int altura) {
        // TODO (ebarrab - 19-02-2025): validación
        this.altura=altura;
    }

    private void setBase(int base) {
        // TODO (ebarrab - 19-02-2025): validación
        this.base=base;
    }

    @Override
    public String toString() {
        return "%s Base=%d Altura=%d".formatted(super.toString(), base, altura);
    }
}
