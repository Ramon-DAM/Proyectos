import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        double[] notas={7.5,9,5};
        double[] pesos={0.2,0.3,0.5};
        // System.out.println(mediaPonderada(notas,pesos));
        System.out.printf("Notas=%s Pesos=%s Media ponderada=%.2f\n",
            Arrays.toString(notas),
            Arrays.toString(pesos),
            mediaPonderada(notas,pesos));
    }

    private static double mediaPonderada(double[] a, double[] pesos) {
        assert a!=null: "El array no puede ser nulo";
        assert a.length>=1: "El array a debe tener longitud >=1";
        assert pesos!=null: "El array no puede ser nulo";
        assert a.length==pesos.length:
            "El array de números debe tener la misma longitud que el array de pesos [lon(a)=%d != lon(pesos)=%d]"
                .formatted(a.length, pesos.length);
        assert estaNormalizado(pesos):
            "El array de pesos debe estar normalizado (sumar 1) [suma=%d]";
        // longitud=0
        double media=0;
        for (int i = 0; i < a.length ; i++)
            media+=pesos[i]*a[i];
        return media;
    }

    private static boolean estaNormalizado(double[] pesos) {
        assert pesos!=null: "El array de pesos no puede ser nulo";
        double suma=0;
        for (double peso: pesos)
            suma+=peso;
        return suma==1;
    }
}