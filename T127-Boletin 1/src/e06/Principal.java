package e06;

public class Principal {

    // La cantidad de dinero viene expresada en euros
    public static void descomposicion(double cantidad) {
        assert cantidad >= 0 : "La cantidad debe ser >=0 [cantidad=%d]".formatted(cantidad);
        int centimos = (int) (cantidad * 100);
        int[] divisores = {1000, 500, 200, 100, 50, 20, 10, 5, 1};     // Céntimos
        int resto = centimos;
        for (int i = 0; i < divisores.length; i++) {
            int n = resto / divisores[i];
            resto = resto % divisores[i];
            if (n > 0)
                switch (divisores[i]) {
                    // Billetes de 10€ y 5€
                    case 1000:
                    case 500:
                        System.out.printf("%d billete%s de %d€\n",
                            n, n==1 ? "" : "s",  divisores[i] / 100);
                        break;
                    // Monedas de 2€ y 1€
                    case 200:
                    case 100:
                        System.out.printf("%d moneda%s de %d€\n",
                            n, n==1 ? "" : "s", divisores[i] / 100);
                        break;
                    // Monedas de 50,20,10,5,1 céntimo/s
                    case 50:
                    case 20:
                    case 10:
                    case 5:
                    case 1:
                        System.out.printf("%d moneda%s de %dc\n",
                            n, n==1 ? "" : "s", divisores[i] / 100);
                        break;
                    default:
                        System.err.println("Error inesperado en descomposición de cantidad de dinero");
                        System.exit(1);
                }

        }
    }
}
