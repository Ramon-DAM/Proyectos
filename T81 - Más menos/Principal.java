public class Principal
{
    public static void main(String[] args) {
        masMenos(10);       // 1+2-3+4-5+6-7+8-9+10        
        masMenos(1);        // 1
        // masMenos(0);     // Error
        // masMenos(-1);    // Error
    }
    
    private static void masMenos(int n) {
        assert n>=1: String.format("El número n debe ser >=1 [n=%d]", n);
        // Primer caso
        System.out.print(1);
        // Resto
        for (int i=2; i<=n; i++)
            System.out.printf("%c%d", i%2==0 ? '+' : '-', i);
        System.out.println();
    }
}