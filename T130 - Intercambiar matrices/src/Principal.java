import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        // Impares
        int[][] impares=new int[3][4];
        for (int i = 0; i < impares.length; i++)
            for (int j = 0; j < impares[i].length; j++)
                impares[i][j]=(i*impares[i].length+j)*2+1;
        // Pares
        int[][] pares=new int[3][4];
        for (int i = 0; i < pares.length; i++)
            for (int j = 0; j < pares[i].length; j++)
                pares[i][j]=(i*pares[i].length+j)*2+2;

        // Mostrar matrices antes del intercambio
        System.out.println("Antes del intercambio");
        System.out.println("Impares");
        mostrar(impares);
        System.out.println("Pares");
        mostrar(pares);

        // Intercambiar matrices
        intercambiar(impares, pares);

        // Mostrar matrices después del intercambio
        System.out.println("Después del intercambio");
        System.out.println("Impares");
        mostrar(impares);
        System.out.println("Pares");
        mostrar(pares);
    }

    // Intercambia el contenido de dos matrices (arrays bidimensionales rectangulares)
    private static void intercambiar(int[][] a, int[][] b) {
        assert a!=null: "La matriz a no puede ser nula";
        assert b!=null: "La matriz b no puede ser nula";
        // Ver si las dimensiones son iguales en las dos matrices
        assert a.length==b.length:
            "El número de filas (%d) de la matriz a es distinto al de la matriz b (%d)"
                .formatted(a.length, b.length);
        assert esRectangular(a): "La matriz a no es rectangular";
        assert esRectangular(b): "La matriz b no es rectangular";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int aux=a[i][j];
                a[i][j]=b[i][j];
                b[i][j]=aux;
            }
        }
    }

    private static boolean esRectangular(int[][] a) {
        assert a!=null: "La matriz a no puede ser nula";
        if (a.length==0)
            return true;
        int lon=a[0].length;
        for (int i = 1; i < a.length; i++)
            if (a[i].length!=lon)
                return false;
        return true;
    }

    private static void mostrar(int[][] a) {
        assert a!=null: "La matriz a mostrar no puede ser nula";
        if (a.length==0)
            System.out.println("[][]");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length==0)
                System.out.print("[]");
            else {
                System.out.print(a[i][0]);          // Primer elemento de la fila actual
                for (int j = 1; j < a[i].length; j++)
                    System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }

}