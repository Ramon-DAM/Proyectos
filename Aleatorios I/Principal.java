import java.io.IOException;

public class Principal
{
    public static void main(String[] args) {
        final int N=10;         // Número de números a generar
        final int A=3;          // Extremo inferior del rango
        final int B=8;          // Extremo superior del rango
        
        System.out.printf("Generación de %d números aleatorios\nenteros en el rango [%d,%d]\n",
            N, A, B);
            
        while (true) {            
            for (int i=1; i<=N; i++)
                System.out.printf("#%02d %d\n", i, generar(A,B));
            pausa();
            System.out.println("=".repeat(5));
        }
    }
    
    // Genera un número aleatorio en el rango [a,b]
    private static int generar(int a, int b) {
        assert a<=b: 
            String.format("El extremo inferior del rango debe ser <= que el superior [%d,%d]", a, b);
        return (int)(Math.random()*(b-a+1))+a;
    }
    
    private static void pausa() {
        try {
            System.in.read();    
        } catch (IOException e) {
            System.out.println(e);
        }        
    }
    
    private static void m1() {
        double x;
        for (int i=1; i<=10; i++) {
            x=(int)(Math.random()*10)+1;
            System.out.printf("%.2f\n", x);
        }
    }
}
