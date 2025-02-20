public class Tanque
{
    private int fila;
    private int columna;
    private char direccion;

    // Un tanque comienza por defecto en (0,0) con direccion 'N'
    public Tanque() {
        // System.out.print("Hola");   
        this(0,0,'N');
    }
    
    public Tanque(int fila, int columna, char direccion) {
        this.fila=fila;
        this.columna=columna;
        this.direccion=direccion;
    }
    
    public Tanque(int fila, int columna) {
        this(fila,columna,'N');
    }
    
    public Tanque(char direccion) {
        this(0,0,direccion);
    }
}
