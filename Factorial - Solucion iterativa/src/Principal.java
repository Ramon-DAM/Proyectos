public class Principal {
    public static void main(String[] args) {
        System.out.println("Factorial iterativo");
        System.out.printf("Máximo número int: %d\n", Integer.MAX_VALUE);
        for (int i = 0; i <= 20; i++)
            System.out.printf("fac(%d)=%d\n", i, fac(i));
    }

    private static int fac(int n) {
        assert n>=0: "El número para calcular el factorial debe ser >=0 [n=%d]".formatted(n);
        if (n==0 || n==1)
            return 1;
        int f=3;
        for (int i = 3; i <= n ; i++) {
//            System.out.printf("%d*%d=%d\n", f, i-1, f*(i-1));
            try {
                f = Math.multiplyExact(f, i-1);
            } catch (ArithmeticException e) {
                System.out.printf("%s: n=%d valor anterior al desbordamiento=%d\n", e, n, f);
                f=0;
                break;
            }
        }
        return f;
    }
}