// El apodo por defecto de un robot tiene la forma: PREFIJO+numero
// El peso por defecto de un robot es MIN_PESO
public class Robot {
    // Atributos
    private static final String PREFIJO="R";    // Prefijo del apodo por defecto
    private static final int MIN_PESO=1;        // Peso (Kg) mínimo de un robot
    private static final int MAX_PESO=30000;    // Peso (Kg) máximo de un robot
    private static int contador=0;              // Número de objetos Robot creados
    private int numero;                         // >=1, AUTO, NO MODIFICABLE
    private String apodo;                       // NO NULO, NO VACÍO, NO MODIFICABLE
    private int peso;                           // <= MAX_PESO
    
    // Constructores
    public Robot() {
        contador++;
        setNumero(contador);
        setApodo(PREFIJO+numero);
        setPeso(MIN_PESO);
    }    
    
    public Robot(String apodo) {        
        contador++;
        setNumero(contador);
        setApodo(apodo);
        setPeso(MIN_PESO);
    }
    
    public Robot(String apodo, int peso) {
        contador++;
        setNumero(contador);
        setApodo(apodo);
        setPeso(peso);
    }
    
    
    
    
    // Métodos
    private void setNumero(int numero) {
        assert numero>=1: 
            String.format("El número de robot debe ser >=1 [numero=%d]", numero);
        this.numero=numero;
    }
    
    public String getApodo() {
        return apodo;
    }
    
    private void setApodo(String apodo) {
        assert ((apodo!=null) && (!apodo.isEmpty())): 
            String.format("El apodo no puede ser nulo ni estar vacío [apodo=%s]", apodo);
        this.apodo=apodo;            
    }
       
    
    public void setPeso(int peso) {
        assert peso>=MIN_PESO && peso<=MAX_PESO: 
            String.format("El peso de un robot debe ser estar en el rango [%d,%d] [peso=%d Kg]", 
                MIN_PESO, MAX_PESO, peso);
        this.peso=peso;
    }
    
    public String toString() {
        return "["+numero+"] "+apodo+" ("+peso+" Kg)";
    }
}