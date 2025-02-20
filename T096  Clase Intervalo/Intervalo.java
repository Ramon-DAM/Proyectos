public class Intervalo
{
    private int a;       // a<b
    private int b;       // b>a
   
    public Intervalo(int a, int b) {
        setAB(a,b);
    } 
    
    public boolean en(int x) {
        return x>=a && x<=b;
    }
    
    public boolean solapamiento(Intervalo otro) {
        int c=otro.a;
        int d=otro.b;
        return  c>=a && d<=b                // Dentro
                || c<=a && d>=b             // Fuera extremos
                || c<=a && d>=a && d<=b     // Izquierda
                || c>=a && c<=b && d>=b;    // Derecha
    }
    
    
    private void setAB(int a, int b) {
        assert a<b: String.format("a debe ser <b [(a,b)=(%d,%d)]", a, b);
        this.a=a;
        this.b=b;
    }
    
    public String toString() {
        return String.format("(%d,%d)", a, b);
    }
}
