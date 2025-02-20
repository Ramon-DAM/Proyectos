import org.jetbrains.annotations.NotNull;

public class Tablero {
    private Robot[] robots;
    private int pos = 0;


    public Tablero(int aforo) {
        assert aforo>=1;
        robots=new Robot[aforo];

    }

    public boolean colocar(@NotNull Robot robot) {
        if (estaLleno())
            return false;

        for (int i = 0; i < robots.length; i++) {
            if 

        }

        return false;
    }

    public boolean estaLleno() {
        for (int i = 0; i < robots.length; i++) {
            if (robots[i]==null)
                return false;

        return true;

        }
    }
}
