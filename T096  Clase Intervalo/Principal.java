public class Principal
{
    public static void main(String[] args) {
        Intervalo i1=new Intervalo(2,5);
        Intervalo i2=new Intervalo(3,4);            // Dentro
        Intervalo i3=new Intervalo(1,6);            // Fuera
        Intervalo i4=new Intervalo(10,20);          // No solapado
        System.out.printf("¿%d está en %s? %s\n", 
            -1, i1, i1.en(-1) ? "SI" : "NO");       // false
        System.out.println(i1.en(3));               // true
        System.out.println(i1.solapamiento(i2));    // true        
        System.out.println(i1.solapamiento(i3));    // true    
        System.out.println(i1.solapamiento(i4));    // false
    }
}