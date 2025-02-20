public class Fabrica {
    private static final Palabra[] PALABRAS=new Palabra[]{
            new Palabra("LIBRO"),
            new Palabra("LANDA"),
            new Palabra("PIDO"),
            new Palabra("ARROBA"),
            new Palabra("SIERPE"),
            new Palabra("OS")
        };

    private Fabrica() {}

    public static Palabra[] generarPalabras() {
        return PALABRAS;
    }
}
