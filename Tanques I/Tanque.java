/*
Tanque 0.1

La unica forma de que un tanque cambie de direccion sera girando.

Un tanque puede girar en el sentido de las agujas del reloj.
Si el tanque esta en la orientacion NORTE al girar cambiara a 
la direccion ESTE.
NORTE -> ESTE -> SUR -> OESTE -> NORTE

girar()      -> 1 giro

Cada tanque debe tener un codigo que comienza por un prefijo T seguido 
un numero autoincrementado a partir de 1
*/
public class Tanque
{
    private final String DIRECCIONES="NESO";
    private int fila;       // >=0
    private int columna;    // >=0
    private char direccion; // N {DIRECCIONES}
    
    // El tanque comienza en una posición aleatoria (PTE)
    // El tanque comienza en la posición (fila=0,columna=0)
    public Tanque() {
        setFila(0);
        setColumna(0);
        setDireccion('N');
    }
    
    public Tanque(char direccion) {
        setFila(0);
        setColumna(0);
        setDireccion(direccion);
    }
    
    public Tanque(int fila, int columna, char direccion) {
        setFila(fila);
        setColumna(columna);
        setDireccion(direccion);
    }    
    
    public int getFila() { return fila; }
    public int getColumna() { return columna; }
    public char getDireccion() { return direccion; }
    
    private void setFila(int fila) {
        assert fila>=0:
            String.format("La fila debe ser >=0 [fila=%d]", fila);
        this.fila=fila;
    }
    
    private void setColumna(int columna) {
        assert columna>=0:
            String.format("La columna debe ser >=0 [columna=%d]", columna);
        this.columna=columna;
    }
    
    private void setDireccion(char direccion) {
        assert DIRECCIONES.indexOf(direccion)>=0: 
            String.format("La dirección debe ser alguna de estas: NSEO [direccion=%c]", direccion);
        this.direccion=direccion;
    }
    
    public void avanzar(int distancia) {
        assert distancia>=0:
            String.format("La distancia a avanzar debe ser >=0 [distancia=%d]", distancia);
        if (direccion=='N')
            setFila(fila-distancia);
        else if (direccion=='E')
            setColumna(columna+distancia);
        else if (direccion=='S')
            setFila(fila+distancia);
        else if (direccion=='O')
            setColumna(columna-distancia);
        else {  // PROGRAMACIÓN DEFENSIVA
            System.err.printf("Dirección inesperada en avanzar [direccion=%c]", direccion);
            System.exit(1);
        }
    }

    // El tanque gira en el sentido de las agujas del reloj
    public void girar() {
         int pos=DIRECCIONES.indexOf(direccion);
         int nuevaPos=(pos+1)%DIRECCIONES.length();
         setDireccion(DIRECCIONES.charAt(nuevaPos));
    }
    
    public String toString() {
        return String.format("(%d,%d) %c", fila, columna, direccion);    
    }
}
