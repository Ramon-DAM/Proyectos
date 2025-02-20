public class Principal
{
    public static void main(String[] args) {
        m1();
    }
    
    private static boolean saludar(int x) {
        System.out.println("Hola");
        if (x>=10)
            return false;
        else
            return true;
    }
    
        
    private static void m1() {
        int contador=1;
        for (int i=1,j=2,k=3; i+j+k<=20 && saludar(i); i+=2,j--,k++,contador++)
            System.out.printf("#%d i=%2d j=%2d k=%2d i+j+k=%2d\n", 
                contador, i, j, k, i+j+k);    
    }
}