import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Tablero {
    private Casilla[][] casillas;

    public Tablero(int filas, int columnas) {
        assert filas>=1:
            "El número de filas del tablero debe ser >=1 [filas=%d]".formatted(filas);
        assert columnas>=1:
            "El número de columnas del tablero debe ser >=1 [columnas=%d]".formatted(columnas);
        casillas=new Casilla[filas][columnas];
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                casillas[i][j]=new Casilla();
    }

    public void colocar(@NotNull Ficha ficha, int fila, int columna) {
        assert fila>=0 && fila<=casillas.length-1:
            "El número de fila donde colocar la ficha debe estar en el rango [%d,%d] [fila=%d]"
                .formatted(0, casillas.length-1, fila);
        assert columna>=0 && columna<=casillas[0].length-1:
            "El número de columna donde colocar la ficha debe estar en el rango [%d,%d] [columna=%d]"
                .formatted(0, casillas[0].length-1, columna);
        casillas[fila][columna].colocar(ficha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++)
                sb.append(casillas[i][j]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
