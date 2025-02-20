import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Tablero {
    private static final int FILAS=16;
    private static final int COLUMNAS=16;
    private static final int MIN_FILA=1;
    private static final int MIN_COLUMNA=1;
    private static final int MAX_FILA=FILAS;
    private static final int MAX_COLUMNA=COLUMNAS;
    private Casilla[][] casillas;                       // <<R>>

    public Tablero() {
        Palabra[] palabras=Fabrica.generarPalabras();
        casillas=new Casilla[FILAS][COLUMNAS];
    }

    public boolean colocar(@NotNull Palabra p, @NotNull Coordenada c, @NotNull Orientacion o) {
        if (!esCoordenada(c))
            return false;
        String s=p.getLetras();
        for (int i = 0; i < s.length(); i++)
            casillas[c.getFila()-1][c.getColumna()-1+i].colocar(s.charAt(i));
        return true;
    }

    public boolean esCoordenada(@NotNull Coordenada c) {
        return  c.getFila()>=MIN_FILA
                && c.getFila()<=MAX_FILA
                && c.getColumna()>=MIN_COLUMNA
                && c.getColumna()>=MAX_COLUMNA;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        // Número de columnas
        // Decenas
        System.out.print("   ");
        for (int i = 1; i <=COLUMNAS; i++)
            System.out.printf(" %s ", i<10 ? "   " : " 1 ");
        System.out.println();
        // Unidades
        System.out.print("   ");
        for (int i = 1; i <=COLUMNAS; i++)
            System.out.printf(" %d ",i%10);
        System.out.println();

        // Números de filas y casillas del tablero
        for (int i = 0; i < casillas.length; i++) {
            System.out.printf(" %d ",i);
            for (int j = 0; j < casillas[i].length; j++)
                sb.append(casillas[i][j]);
            System.out.println();
        }
        return sb.toString();
    }
}
