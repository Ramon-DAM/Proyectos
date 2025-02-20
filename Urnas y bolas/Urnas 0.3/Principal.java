// Urnas 0.3
public class Principal
{
    public static void main(String[] args) {
        Urna u1=new Urna();
        Urna u2=new Urna();
        Urna u3=new Urna();
        
        // a. Agregar 3 bolas a una urna usando for
        for (int i=1; i<=3; i++)
            u1.agregar();

        // b. Agregar 3 bolas a una urna usando while
        int i=0;
        while (++i<=3)
            u2.agregar();

        // c. Sacar 3 bolas de una urna usando do-while
        u3.llenar();
        System.out.println("Urna 3 (llena): "+u3);
        i=1;
        do {
            u3.sacar();
        } while (++i<=3);
        
        System.out.println("Urna 1: "+u1);
        System.out.println("Urna 2: "+u2);
        System.out.println("Urna 3: "+u3);
       
    } 
}
