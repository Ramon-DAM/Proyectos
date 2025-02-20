import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] impares=new int[10];
        for (int i=0; i < impares.length; i++) {
            impares[i]=i*2+1;
        }
        System.out.println(Arrays.toString(primos(impares, new Rango(5,10))));
        System.out.println(Arrays.toString(primos(impares, new Rango(0,1))));
    }

    private static int[] primos(int[] a, @NotNull Rango rango) {
        assert a!=null: "El array no puede ser nulo";
        int contador=0;
        for (int i = 0; i < a.length; i++) {
            if (esPrimo(a[i]) && rango.en(a[i]))
                contador++;
        }
        int[] r=new int[contador];
        if (contador>=1)
            for (int i=0, j=0; i<a.length; i++) {
                if (esPrimo(a[i]) && rango.en(a[i]))
                    r[j++]=a[i];
        }
        return r;
    }

    // Sólo permitimos números >=1
    private static boolean esPrimo(int n) {
        if (n<=1)
            return false;
        for (int i=2; i<=n-1 ; i++) {
            if (n%i==0)     // ¿Es n divisible por i?
                return false;
        }
        return true;
    }
}