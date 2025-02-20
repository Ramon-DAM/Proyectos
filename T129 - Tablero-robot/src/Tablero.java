import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Tablero {
    private Robot[] robots;     // <<R>>

    public Tablero(int aforo) {
        assert aforo>=1: "El aforo del tablero debe ser >=1 [aforo=%d]".formatted(aforo);
        robots=new Robot[aforo];
    }

    public boolean colocar(@NotNull Robot robot) {
        if (estaLleno())
            return false;
        // Ver si el mismo robot está ya colocado en el tablero
        for (int i = 0; i < robots.length; i++)
            if (robots[i]==robot)
                return false;
        // Colocar el robot
        for (int i = 0; i < robots.length; i++)
            if (robots[i]==null) {
                robots[i] = robot;
                return true;
            }
        return false;           // La ejecución no debería llegar a esta línea
    }

    private boolean estaLleno() {
        for (int i = 0; i < robots.length; i++)
            if (robots[i]==null)
                return false;
        return true;
    }

    public int getAforo() { return robots.length; }

    @Override
    public String toString() {
        return Arrays.toString(robots);
    }
}
