import java.util.HashSet;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        HashSet<Animal> animales=new HashSet<>();
        Animal a1=new Animal("PERRO");
        Animal a2=new Animal("GATO");
        Animal a3=new Animal("RATON");
        Animal a4=new Animal("GATO");
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);
        animales.add(a4);
        System.out.println(a1+"->"+a1.hashCode());
        System.out.println(a2+"->"+a2.hashCode());
        System.out.println(a3+"->"+a3.hashCode());
        System.out.println(a4+"->"+a4.hashCode());

        // Recorrer el conjunto usando for each
        System.out.println("For each");
        for (Animal a: animales)
            System.out.println(a);

        // Recorrer el conjunto usando un iterador
        System.out.println("Iterador");
        Iterator<Animal> it=animales.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.printf("Hay %d animales en el conjunto", animales.size());

        m1(animales);
    }

    // Añadimos más animales al conjunto para provocar que la Tabla de Hash interna crezca
    private static void m1(HashSet<Animal> h) {
        for (int i = 1; i <= 100  ; i++)
            h.add(new Animal("NUEVO-"+i));
    }
}