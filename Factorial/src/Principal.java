public class Principal {
    public static void main(String[] args) {
//        f(1);
        System.out.println("Factorial recursivo");
        System.out.printf("Máximo número int: %d\n", Integer.MAX_VALUE);
        for (int i = 0; i <=13 ; i++)
            System.out.printf("fac(%d)=%d\n", i, fac(i));
    }

    // Condición de parada no se cumple para >=1
    private static int f(int x) {
        if (x<=0)
            return 0;
        System.out.println(x);
        return f(x+1);
    }

    private static int fac(int n) {
        assert n >= 0 : "El número para calcular su factorial debe ser >=0 [n=%d]".formatted(n);
        if (n == 0 || n == 1)
            return 1;
        int f=0;
        try {
            f = Math.multiplyExact(n, fac(n - 1));
        } catch (ArithmeticException e) {
            System.err.printf("%s: fac(%d)=%d\n", e, n, f);
        }
        return f;
    }

    // Factorial con mensajes de depuración
    private static int facDep(int n) {
        assert n >= 0 : "El número para calcular su factorial debe ser >=0 [n=%d]".formatted(n);
        int f;
        if (n == 0 || n == 1)
            f=1;
        else
            f=n*fac(n-1);
        System.out.printf("fac(%d)=%d\n", n, f);
        return f;
    }
}