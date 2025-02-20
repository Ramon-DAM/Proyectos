
public class Granja
{
    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;
    
    public Granja() {}
    
    public void agregar(Animal animal) {
        assert animal!=null: "El animal a agregar no puede ser nulo";
        assert !estaLlena(): 
            String.format("La granja está llena. No es posible agregar el animal %s", animal);
        if (a1==null)
            a1=animal;
        else if (a2==null)
            a2=animal;
        else if (a3==null)
            a3=animal;
        else if (a4==null)
            a4=animal;            
        else {                   // PROGRAMACIÓN DEFENSIVA
            System.err.println("La ejecución no debería llegar aquí. Granja llena inesperadamente");
            System.exit(1);
        }
            
    }
    
    // Saca de la granja el primer animal cuyo apodo coincide con el recibido
    public Animal sacar(String apodo) {
        assert apodo!=null: "El apodo del animal a sacar no puede ser nulo";
        assert !estaVacia(): 
            String.format("No es posible sacar un animal llamado %s porque la granja está vacía", apodo);
        
        Animal aux=null;       
        if (apodo.equals(a1.getApodo())) {
            aux=a1;
            a1=null;        
        } else if (apodo.equals(a2.getApodo())) {
            aux=a2;
            a2=null;
        } else if (apodo.equals(a3.getApodo())) {
            aux=a3;
            a3=null; 
        } else if (apodo.equals(a4.getApodo())) {
            aux=a4;
            a4=null;
        } else {                   // PROGRAMACIÓN DEFENSIVA
            System.err.println("La ejecución no debería llegar aquí. Granja vacía inesperadamente");
            System.exit(1);
        }
        return aux;     
    }
    
    public boolean estaVacia() {
        return a1==null && a2==null && a3==null && a4==null;
    }
    
    public boolean estaLlena() {
        return a1!=null && a2!=null && a3!=null && a4!=null;
    }
}
