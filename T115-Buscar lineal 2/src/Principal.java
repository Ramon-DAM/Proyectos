import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buscarLineal2(new int[]{1,3,5,7,3,9,11,3,3}, 1)));
        System.out.println(Arrays.toString(buscarLineal2(new int[]{1,3,5,7,3,9,11,3,3}, 3)));
        System.out.println(Arrays.toString(buscarLineal2(new int[]{1,3,5,7,3,9,11,3,3}, 2)));
    }

    // v=Valor buscado
    private static int[] buscarLineal2(int[] a, int v) {
        assert a!=null: "El array no puede ser nulo";
        // longitud 0
        int contador=0;
        for (int i = 0; i < a.length; i++)
            if (a[i]==v)
                contador++;
        int[] r=new int[contador];
        if (contador>=1)
            for (int i=0, j=0; i<a.length; i++)
                if (a[i]==v)
                    r[j++]=i;
        return r;
    }
}