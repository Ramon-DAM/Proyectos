import java.util.Random;

public class Principal
{
    public static void main(String[] args) {
        Random r=new Random();
        int x=r.nextInt(10);
        boolean b=r.nextBoolean();
        double d=r.nextDouble();
        System.out.printf("x=%d b=%b d=%.2f\n", x, b, d);        
    }
}
