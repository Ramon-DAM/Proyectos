import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        HashMap<Persona, HashSet<Mascota>> h=new HashMap<>();
        HashSet<Mascota> m=new HashSet<>();
        m.add(new Mascota("PERLA"));
        m.add(new Mascota("ELSA"));
        h.put(new Persona("LEO"),m);
        mostrar(h);
        m.add(new Mascota("JOSEFINA"));
//        h.put(new Persona("LEO"), m)          -> No necesario
        mostrar(h);
    }

    private static void mostrar(HashMap<Persona, HashSet<Mascota>> h) {
        // Mostrar el hashmap h con un iterador
        Iterator<Map.Entry<Persona, HashSet<Mascota>>> it= h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Persona, HashSet<Mascota>> entrada=it.next();
            System.out.printf("Persona=%s Mascotas=%s\n", entrada.getKey(), entrada.getValue());
        }
    }
}