import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Ordenación de listas
 * @author ebarrab
 * @version 0.1
 *
 */
public class Principal {
    public static void main(String[] args) {
        LinkedList<Animal> animales=new LinkedList<>();
        animales.add(new Animal("ROSITA", 3, Pelaje.OSCURO));
        animales.add(new Animal("ROSITA", 500, Pelaje.MIXTO));
        animales.add(new Animal("KINGKONG", 1000, Pelaje.CLARO));
        animales.add(new Animal("COCO", 15, Pelaje.RIZADO));
        animales.add(new Animal("JOSEFINA", 1, Pelaje.MIXTO));

        // Ordenación natural usando Comparable
        System.out.println("Ordenación natural usando Comparable: por apodo del animal");
        Collections.sort(animales);
        System.out.println(animales);
        System.out.println("-".repeat(10));

        // Ordenación usando Comparator: por peso
        System.out.println("Ordenación usando Comparator: por peso del animal");
        Collections.sort(animales, new ComparadorAnimalPeso());
//        animales.sort(new ComparadorAnimalPeso());
        System.out.println(animales);
        System.out.println("-".repeat(10));

        // Ordenación usando Comparator: por pelaje (ordinal)
        System.out.println("Ordenación usando Comparator: por pelaje del animal (usando ordinal)");
        Collections.sort(animales, new ComparadorAnimalPelajeOrdinal());
        System.out.println(animales);
        System.out.println("-".repeat(10));

        // Ordenación usando Comparator: por pelaje (grado)
        System.out.println("Ordenación usando Comparator: por pelaje del animal (usando grado)");
        Collections.sort(animales, new ComparadorAnimalPelajeGrado());
        System.out.println(animales);
        System.out.println("-".repeat(10));

        // Ordenación usando Comparator: por apodo y peso (usando clase anónima)
        System.out.println("Ordenación usando Comparator: por apodo y peso del animal" +
            " (usando clase anónima)");
        Collections.sort(animales, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                int c1=o1.getApodo().compareTo(o2.getApodo());
                return c1==0 ? o1.getPeso()-o2.getPeso() : c1;
            }
        });
        System.out.println(animales);
        System.out.println("-".repeat(10));

        ordenacionComparatorApodoPeso(animales);
    }

    /**
     * Ordenación usando la interface Comparator.
     * Por apodo y peso
     *
     * @param animales  Lista de animales a ordenar
     * @see java.util.Collections#sort(List) 
     */
    private static void ordenacionComparatorApodoPeso(LinkedList<Animal> animales) {
        // Ordenación usando Comparator: por apodo y peso (usando lambda)
        System.out.println("Ordenación usando Comparator: por apodo y peso del animal" +
            " (usando lambda)");
        Collections.sort(animales, (o1, o2) -> {
            int c1=o1.getApodo().compareTo(o2.getApodo());
            return c1==0 ? o1.getPeso()-o2.getPeso() : c1;
        });
        System.out.println(animales);
        System.out.println("-".repeat(10));
    }
}