
public class Bola
{
    private Color color;        // NO NULO, NO MODIFICABLE
    
    public Bola(Color color) {
        setColor(color);
    }
    
    private void setColor(Color color) {
        assert color!=null: "El color de una bola no puede ser nulo";
        this.color=color;
    }
    
    public String toString() {
        return color.toString();
    }
}
