public class Bola
{
    private static int NUMCOLORES = 4;
    private static int contador = 0;
    private int numero;         // >=1, AUTO, NO MODIFICABLE
    private Color color;        // NO NULO {AMARILLO, AZUL, ROJO, VERDE}, NO MODIFICABLE            
   
    public Bola(Color color) {
        setNumero(++contador);
        setColor(color);
    } 
    
    public static Bola generar() {
        int x=(int)(Math.random()*NUMCOLORES);
        Color color;
        switch (x) {
            case 0:               
                color=Color.AMARILLO;
                break;
            case 1:               
                color=Color.AZUL;
                break;
            case 2:               
                color=Color.ROJO;
                break;
            case 3:
                color=Color.VERDE;
                break;      
            default:                // PROGRAMACIÓN DEFENSIVA
                color=null;
                System.err.printf("Número generado para color inesperado [numero=%d]",
                    x);
                System.exit(1);
        }
        return new Bola(color);                
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getNumero() {
        return numero;
    }
    
    private void setNumero(int numero) {
        assert numero>=1: 
            String.format("El número de bola debe ser >=1 [numero=%d]",
                numero);
        this.numero=numero;
    }
    
    private void setColor(Color color) {
        assert color!=null: "El color de la bola no puede ser nulo";
        this.color=color;
    }
    
    public static int totalBolas() {
        return contador;
    }
    
    public String toString() {
        return String.format("%d %s", numero, color);
    }
}
