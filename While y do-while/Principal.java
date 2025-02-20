import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        // m1(10);
        // m2(10);
        m3(100);
        // System.out.println('A'<'B');
        // System.out.println("A".compareTo("C"));
    }
    
    private static void m1(int n) {
        int i=1;
        while (i<=n)            
            System.out.printf("%2d Hola mundo\n", i++);
    }
    private static void m2(int n) {
        int i=1;
        do {
            System.out.printf("%2d Hola mundo\n", i); 
        } while (++i<=n);
    }
    
    // Juego de adivinar un número entre 1 y n
    private static void m3(int n) {
        assert n>=1:
            "El número n debe ser >=1 [n=%d]".formatted(n);
        boolean correcto=false;
        Scanner sc=new Scanner(System.in);
        int secreto=(int)(Math.random()*n)+1;     // [0,1)*n=[0,n)=[0,n-1]+1
        do {
            System.out.printf("Adivine un número en el rango [1,%d]\n", n);
            int leido=sc.nextInt();
            if (leido==secreto)
                correcto=true;
            else if (leido>secreto)
                System.out.printf("El número introducido %d es mayor que el número secreto\n", 
                    leido);
            else // leido<secreto
                System.out.printf("El número introducido %d es menor que el número secreto\n", 
                    leido);
        } while (!correcto);
        System.out.printf("Has adivinado el número secreto [secreto=%d]", secreto);
    }
    
}