public class Libro
    extends Publicacion
{
    public void b() {
        System.out.println("b");
    }

    @Override
    public String toString() {
        return "Libro{}";
    }
}
