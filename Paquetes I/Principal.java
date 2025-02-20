import proveedores.*;
import clientes.X;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static paquetito.Util.*;

public class Principal
{
    public static void main(String[] args) {
        X x=new X();
        clientes.Cliente c1=new clientes.Cliente();
        Proveedor p1=new Proveedor();
        System.out.println(c1);
        System.out.println(p1);
        
        // Operaciones mátemáticas aprovechando el uso de import static
        double y=sqrt(pow(sqrt(PI),2));
        System.out.printf("y=%.4f\n", y);
        System.out.println(max(3,2));
    }
}

