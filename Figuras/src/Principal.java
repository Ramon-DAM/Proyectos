import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        Figura f1=new Figura();
        Triangulo t1=new Triangulo(Color.VERDE, 2, 5);
        Triangulo t2=new Triangulo(Color.ROJO, 3, 9);
        Figura f1=new Triangulo(Color.AZUL, 4, 5);
        System.out.printf("El tipo dinámico de f1 es %s\n", f1.getClass().getName());
        ArrayList<Figura> figuras=new ArrayList<>();
        figuras.add(t1);
        figuras.add(t2);
        for (Figura f: figuras)
            System.out.println(f);
    }

    private void mostrar(@NotNull Figura figura) {
        System.out.println(figura);
    }
}