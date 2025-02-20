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
        Granja g1=new Granja();
        g1.agregar(anita);
        g1.agregar(rosita);
        g1.agregar(a1);
        g1.agregar(a2);
        Animal a3=g1.sacar("ROSITA");
        if (a3!=null)
            System.out.printf("He sacado el animal %s de la granja\n", a3);
        else
            System.out.printf("No he sacado el animal %s porque no está en la granja\n", a3);        
        System.out.println(g1);
        Animal josefina=new Animal("JOSEFINA");
        g1.agregar(josefina);
        System.out.printf("He agregado al animal %s a la granja\n", josefina);
        System.out.println(g1);
        System.out.println("Voy a vaciar la granja de animales");
        g1.vaciar();
        System.out.println(g1);
    }
}
