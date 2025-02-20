import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static utilidades.Util.max;

public class Principal {
    public static void main(String[] args) {
        double x=sqrt(4);
        double y=pow(4,2);
        double z1=Math.max(4,3);
        double z2=max(4,3);
        System.out.printf("%.2f %.2f %.2f",x,y,z1,z2);
    }
}