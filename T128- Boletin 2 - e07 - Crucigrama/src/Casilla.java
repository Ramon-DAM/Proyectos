import java.text.Collator;
import java.util.Locale;

public class Casilla {
    private static final char CUADRADO_NEGRO='⏹';
    private char letra;     // Puede contener: espacio (casilla vacía), letra o ⏹

    public Casilla() {
        setLetra(' ');
    }

    public boolean colocar(char letra) {
        if (!estaVacia())
            return false;
        setLetra(letra);
        return true;
    }

    public boolean colocarCuadradoNegro() {
        if (!estaVacia())
            return false;
        setLetra(CUADRADO_NEGRO);
        return true;
    }

    public boolean estaVacia() {
        return letra==' ';
    }

    private void setLetra(char letra) {
        Collator c=Collator.getInstance(new Locale("es","ES"));
        assert  letra==' '
                || (c.compare(String.valueOf(letra), "A") >=0
                    && c.compare(String.valueOf(letra), "Z") <=0)
                || letra==CUADRADO_NEGRO;
        this.letra=letra;
    }

    @Override
    public String toString() {
        return "|%c|".formatted(letra);
    }
}
