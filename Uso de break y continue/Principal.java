public class Principal
{
    public static void main(String[] args) {
        // m1();
        // m2();
        m3();
    }
    
    private static void m3() {
        for (int i=1; 
                i<=10; 
                    i++) {
            System.out.printf("i=%d", i);            
            if (i%5==0)
                break;
            else if (i%3==0)
                continue;            
            System.out.print(" -> Hola mundo\n");
        }    
    }
    
    
    // break en do while
    private static void m2() {
        int contador=1;
        do {
            System.out.printf("Contador=%d\n", contador);
            if (contador%5==0)      // Múltiplo de 5
                break;
            ++contador;
        } while (true);
        System.out.printf("Fin de m1() [contador=%d]\n", contador);
    }
    
    
    // break y continue en while
    private static void m1() {
        int contador=0;
        while (++contador<=10) {
            System.out.printf("Contador=%d", contador);
            if (contador%5==0)      // Múltiplo de 5
                break;
            else if (contador%3==0)
                continue;
            System.out.printf(" -> Hola mundo\n");
        }
        System.out.printf("Fin de m1() [contador=%d]\n", contador);
    }
}