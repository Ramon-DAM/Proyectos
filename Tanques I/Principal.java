public class Principal
{
    public static void main(String[] args) {
        Tanque t1=new Tanque();
        Tanque t2=new Tanque('S');
        Tanque t3=new Tanque(2,5,'E');
        t1.girar();
        t1.avanzar(3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
