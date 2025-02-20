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
        
        // Comparación de animales con equals
        Animal a4=new Animal("PEDRO");
        Animal a5=new Animal("PEDRO");
        Animal a6=new Animal("CEDRO");
        System.out.printf("¿a4 [%s] es igual a a5 [%s]? %b\n", a4, a5, a4.equals(a5));
        System.out.printf("¿a1 [%s] es igual a a2 [%s]? %b\n", a1, a2, a1.equals(a2));
        
        // Comparación de animales con compareTo
        System.out.printf("¿a4 [%s] comparado con a5 [%s]? %d\n", a4, a5, a4.compareTo(a5));
        System.out.printf("¿a5 [%s] comparado con a6 [%s]? %d\n", a5, a6, a5.compareTo(a6));  
        System.out.printf("'P'[%d]-'C'[%d]=%d\n", (int)'P', (int)'C', 'P'-'C');
  }
}
