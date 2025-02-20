public class Principal
{
    public static void main(String[] args) {
        System.out.println("m1");
        m1();
        System.out.println("\nm2");
        m2();
    }
    
    private static void m1() {
        int i=0;
        while (++i<=5)
            System.out.print(i);
    }
    
    private static void m2() {
        for (int i=1; i<=5; i++)
            System.out.print(i);            
    }  
}