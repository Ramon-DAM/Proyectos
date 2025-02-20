public class Principal
{
   public static void main(String[] args) {
       Animal a1=new Animal("ANITA", 2); 
       Animal a2=new Animal("ANITA", 3);
       System.out.printf("a1=%s a2=%s\n", a1, a2);  
       System.out.printf("a1==a2 %b\na1.equals(a2) %b\n", 
           a1==a2, a1.equals(a2));
   }
}
