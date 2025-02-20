public class Principal
{
   public static void main(String[] args) {
       a();
   }
   
   private static void a() {
       System.out.print(b(3));   // Muestra 1
   }
   
   private static int b(int x) {
       return c(--x);   // return 1
   }
   
   private static int c(int y) {
       return --y;      // return 1
   }
}
