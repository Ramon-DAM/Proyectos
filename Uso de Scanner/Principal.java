import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String apodo="";
        float peso=0;
        String comentario="";
        System.out.print("Introduzca su apodo y su peso (Kg)");
        apodo=sc.next();
        peso=sc.nextFloat(); 
        comentario=sc.nextLine();
        System.out.printf("Su apodo es: %s\n", apodo);
        System.out.printf("Su peso es: %f\n", peso);
        if (peso>100)
            System.out.println("Está usted entradito en carnes (peso>100)");       
        System.out.printf("Comentario: %s\n", comentario);
    }
}
