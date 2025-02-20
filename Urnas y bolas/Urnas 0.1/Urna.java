
public class Urna
{
    private static final int CAPACIDAD=3;
    private Bola b1;    // <<R>>
    private Bola b2;    // <<R>>
    private Bola b3;    // <<R>>
    
    public Urna() {}
    
    public void agregar(Bola bola) {
        assert bola!=null: "La bola a agregar a la urna no puede ser nula";
        assert !estaLlena(): 
            String.format("No es posible agregar la bola %s a la urna porque está llena [capacidad=%d]",
                bola, CAPACIDAD);
        if (b1==null)
            b1=bola;
        else if (b2==null)
            b2=bola;
        else if (b3==null)
            b3=bola;
        else {          // PROGRAMACIÓN DEFENSIVA
            System.err.printf("La urna está inesperadamente llena");
            System.exit(1);
        }            
    }
    
    public boolean estaLlena() {
        return b1!=null && b2!=null && b3!=null;
    }
    
    public boolean estaVacia() {
        return b1==null && b2==null && b3==null;
    }
    
    public int getCapacidad() {
        return CAPACIDAD;
    }
    
    public void llenar() {
        while (!estaLlena())
            agregar(Bola.generar());
    }
    
    public Bola sacar() {
        assert !estaVacia(): 
            "No es posible sacar una bola aleatoriamente porque la urna está vacía";
        
        Bola aux=null;
        do {
            int n=(int)(Math.random()*CAPACIDAD)+1;    // [1, CAPACIDAD]
          
            switch (n) {
                case 1:
                    if (b1!=null) {     // Hay bola en b1
                        aux=b1;
                        b1=null;                        
                    }
                    break;
                case 2:
                    if (b2!=null) {     // Hay bola en b2
                        aux=b2;
                        b2=null;                        
                    }
                    break;
                case 3:
                    if (b3!=null) {     // Hay bola en b3
                        aux=b3;
                        b3=null;                        
                    }
                    break;
                default:                // PROGRAMACIÓN DEFENSIVA
                    System.err.printf("Número inesperado [n=%d]\n", n);
                    System.exit(1);            
            }
        
        } while (aux==null);
        return aux;
    }        
    
    public Bola sacar(String color) {
        assert color!=null: "El color de la bola a sacar no puede ser nulo";
        assert !estaVacia(): 
            "No es posible sacar una bola aleatoriamente porque la urna está vacía";    
        Bola r=null;
        if (b1!=null && b1.getColor().equals(color)) {
            r=b1;
            b1=null;            
        } else if (b2!=null && b2.getColor().equals(color)) {
            r=b2;
            b2=null;
        } else if (b3!=null && b3.getColor().equals(color)) {
            r=b3;
            b3=null;
        }    
            
        return r;
    }
    
    public void vaciar() {
        b1=b2=b3=null;
    }
    
    public String toString() {
        return String.format("|%s|%s|%s| Capacidad=%d %s",
            b1, b2, b3, CAPACIDAD, 
            (estaVacia() ? "VACIA" : "") + (estaLlena() ? "LLENA" : ""));
    }    
}
