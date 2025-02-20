public class Principal
{
    public static void main(String[] args) {
        Animal anita=new Animal("ANITA", 2);
        Animal rosita=new Animal("ROSITA", 3);
        Animal a1=new Animal();
        Animal a2=new Animal(600);
        anita.comer();
        rosita.comer(0.1f);
        System.out.println("Amigas: "+anita+" y "+rosita);
        System.out.println("Otros animales: "+a1+" y "+a2);
    }
}
