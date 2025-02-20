public class Principal
{
    public static void main(String[] args) {
        Animal anita=new Animal("ANITA", 2);
        Animal rosita=new Animal("ROSITA", 3);
        Animal a1=new Animal();
        Animal a2=new Animal(600);
        anita.comer();
        rosita.comer(0.1f);
        System.out.println("Amigas: "+anita+"---"+rosita);
        System.out.println("Otros animales: "+a1+"---"+a2);
        Granja g1=new Granja();
        g1.agregar(anita);
        g1.agregar(rosita);
        g1.agregar(a1);
        g1.agregar(a2);
        Animal a3=g1.sacar("ROSITA");
        System.out.printf("He sacado el animal %s de la granja\n", a3);
        g1.agregar(new Animal("JOSEFINA"));       
    }
}
