public class Bola
{
    private static int contador = 0;
    private int numero;      // >=1, AUTO, NO MODIFICABLE
    private String color;    // NO NULO {AZUL, ROJO, VERDE}, NO MODIFICABLE            
   
    public Bola(String color) {
        setNumero(++contador);
        setColor(color);
    } 
    
    public static Bola generar() {
        int x=(int)(Math.random()*3);
        String color;
        switch (x) {
            case 0:               
                color="AZUL";
                break;
            case 1:               
                color="ROJO";
                break;
            case 2:
                color="VERDE";
                break;      
            default:                // PROGRAMACIÓN DEFENSIVA
                color="";    
                System.err.printf("Número generado para color inesperado [numero=%d]",
                    x);
                System.exit(1);
        }
        return new Bola(color);                
    }
    
    public String getColor() {
        return color;
    }
    
    private void setNumero(int numero) {
        assert numero>=1: 
            String.format("El número de bola debe ser >=1 [numero=%d",
                numero);
        this.numero=numero;
    }
    
    private void setColor(String color) {
        assert color!=null: "El color de la bola no puede ser nulo";
        assert color.equals("AZUL") || color.equals("ROJO") || color.equals("VERDE"):
            String.format("El color de la bola debe ser AZUL, ROJO o VERDE [color=%s]",
                color);    
        this.color=color;
    }
    
    public String toString() {
        return String.format("%d %s", numero, color);
    }
}
