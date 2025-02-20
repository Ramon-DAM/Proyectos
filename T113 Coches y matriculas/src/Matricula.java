import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Matricula {
    private static final String FORMATO="9999AAA";

    private String texto;   // NO NULO, NO VACIO, FORMATO=9999AAA, MAYÚSCULAS

    public Matricula(String texto) {
        setTexto(texto);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(texto, matricula.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(texto);
    }

    public void setTexto(@NotNull String texto) {
        assert !texto.isBlank():
                "El texto no puede estar vacío ni en blanco [texto=%s]".formatted(texto);
        /* assert validarFormato(texto):
                xxx */
        this.texto = texto;
    }

    private boolean esNumero(char c) {
        return c>='0' && c<='9';
    }

    private boolean esLetraMay(char c) {
        return c>='A' && c<='Z';
    }

    private boolean validarFormato(@NotNull String texto) {
        if (texto.length()!=FORMATO.length())
            return false;

        for (int i = 0; i < texto.length(); i++) {
            char c=texto.charAt(i);
            if  (   (esNumero(c) && FORMATO.charAt(i)!='9')
                    ||  (esLetraMay(c) && FORMATO.charAt(i)!='A')   )
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return texto;
    }
}
