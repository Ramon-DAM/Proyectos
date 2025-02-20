import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
//        for (int c='A'; c <='Z' ; c++) {
//            System.out.printf("'%c'=%d\n", c, c);
//        }
//        System.out.printf("'%c'=%d\n", 'Ñ', (int)'Ñ');
        Coche[] coches=generarCoches(new Matricula[]{   new Matricula("1111ABC"),
                                                        new Matricula("2222DEF"),
                                                        new Matricula("3333GHI"),
                                                        new Matricula("4444JKL")
                                                    });
        for (Coche coche: coches)
            System.out.println(coche);
    }

    private static Coche[] generarCoches(@NotNull Matricula[] matriculas) {
        assert validarMatriculas(matriculas):
            "Las matriculas recibidas no son correctas [matriculas=%s]"
                .formatted(Arrays.toString(matriculas));
        Coche[] coches=new Coche[matriculas.length];
        for (int i = 0; i < coches.length; i++)
            coches[i]=new Coche(matriculas[i]);
        return coches;
    }

    // No debe haber ningún elemento null
    // No debe haber dos matrículas iguales
    // Si el array tiene longitud 0 devolver false
    private static boolean validarMatriculas(@NotNull Matricula[] matriculas) {
        if (matriculas.length==0)
            return false;

        // Comprobar que no hay ningún null: @NotNull lo hace

        // Comprobar que no hay dos matrículas iguales
        for (int i = 0; i < matriculas.length; i++)
            for (int j = 0; j < matriculas.length; j++)
                if (i!=j && matriculas[i].equals(matriculas[j]))
                    return false;
        return true;
    }


}