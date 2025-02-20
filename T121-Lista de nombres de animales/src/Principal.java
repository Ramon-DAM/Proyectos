import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        String nombres="ANITA,ROSITA,PEDRO,COQUITA,DAENERIS";
        System.out.println(Arrays.toString(nombresAnimales(nombres)));
    }

    // lista=Nombres de animales separados por coma
    private static String[] nombresAnimales(@NotNull String lista) {
        return lista.split(",");
    }
}