import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
//        System.out.println(buscarDicotomica("zabcde".toCharArray(), 'e'));
        System.out.println(buscarDicotomica("abcde".toCharArray(), 'e'));
        System.out.println(buscarDicotomica("abcde".toCharArray(), 'x'));
        System.out.println(buscarDicotomica(new char[0], 'x'));
    }

    // El array a debe estar ordenado ascendentemente
    public static boolean buscarDicotomica(char[] a, char v) {
        assert a!=null: "El array no puede ser nulo";
        assert estaOrdenado(a):
            "El array recibido debe estar ordenado ascendentemente [a=%s]"
                .formatted(Arrays.toString(a));

        int izquierda=0;
        int derecha=a.length-1;
        int mitad=0;

        while (izquierda<=derecha) {
            mitad=(izquierda+derecha)/2;
            if (a[mitad]==v)
                return true;
            else if (a[mitad]>v)
                derecha=mitad-1;
            else
                izquierda=mitad+1;
        }
        return false;
    }

    // Si el array es de longitud 0 devolvemos true
    private static boolean estaOrdenado(char[] a) {
        assert a!=null: "El array no puede ser nulo";

        for (int i = 0; i < a.length-1; i++)
            if (a[i]>a[i+1])
                return false;

        return true;
    }
}