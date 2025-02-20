public class Principal
{
    public static void main(String[] args) {
        // m1();
        m2();
    }
    
    private static void m2() {
        int contador=0; // Nº iteraciones
        for (int i=1, j=10; i<j; i++, j--)
            System.out.printf("#%d i=%2d j=%2d Hola mundo\n",
                ++contador, i, j);        
    }
        
    private static void m1() {    
        for (int i=1; 
                i<=10; 
                    i++)
            System.out.printf("%2d Hola mundo\n", i);
    }
}