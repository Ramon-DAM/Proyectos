import org.jetbrains.annotations.NotNull;

public class Principal {
    public static void main(String[] args) {
        System.out.println(estaOrdenado(new int[]{1,2,3,4,5,2,6}));
        System.out.println(estaOrdenado(new int[]{1,2,3,4,5,6}));
    }

    // Si el array es de longitud 0 devolvemos true
    private static boolean estaOrdenado(int[] a) {
        assert a!=null: "El array no puede ser nulo";

        for (int i = 0; i < a.length-1; i++)
            if (a[i]>a[i+1])
                return false;

        return true;
    }
}