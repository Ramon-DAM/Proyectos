
public class Intervalo
{
    private Intervalo() {}
    
    // Devuelve true si x pertenece al intervalo cerrado [a,b] (e.o.c. false)
    public static boolean enCerrado(int x, int a, int b) {
        return x>=a && x<=b;    
    }
    
    // Devuelve true si los intervalos cerrados [a,b] y [c,d] se solapan
    public static boolean solapamiento(int a, int b, int c, int d) {
        // TODO
        return true;
    }
}
