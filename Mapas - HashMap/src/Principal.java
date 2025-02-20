import java.util.*;

public class Principal {
    public static void main(String[] args) {
        HashMap<Animal,Integer> animales=new HashMap<>();
        animales.put(new Animal("PERRO"), 10);
        animales.put(new Animal("GATO"), 20);
        animales.put(new Animal("RATON"), 10);
        animales.put(new Animal("GATO"), 99);

        // Recorrer el mapa de animales usando el conjunto de claves
//        m1(animales);

        // Recorrer el mapa de animales usando el conjunto de entradas
        Set<Map.Entry<Animal,Integer>> pares=animales.entrySet();
        Iterator<Map.Entry<Animal,Integer>> it=pares.iterator();
        while (it.hasNext()) {
            Map.Entry<Animal, Integer> par = it.next();
            System.out.printf("%s -> %s\n", par.getKey(), par.getValue());
        }
    }

    private static void m1(HashMap<Animal, Integer> animales) {
        Set<Animal> claves= animales.keySet();
        Iterator<Animal> it=claves.iterator();
        while (it.hasNext()) {
            Animal a = it.next();
            System.out.printf("%s -> %s\n", a, animales.get(a));
        }
    }
}