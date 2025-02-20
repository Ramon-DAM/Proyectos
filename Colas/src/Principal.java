import java.util.*;

public class Principal {
    public static void main(String[] args) {
        m1();
    }

    // Cola usando LinkedList
    private static void m1() {
        List<String> nombres=Arrays.asList("EDUARDO", "ANA", "ROBERTO", "BRUNO", "ELOY");
        LinkedList<Persona> cola1=new LinkedList<>();

        for (int i = 0; i < nombres.size(); i++)
            cola1.add(new Persona(nombres.get(i)));

        // Mostrar la cola usando for
        for (int i = 0; i < cola1.size(); i++)
            System.out.println(cola1.get(i));

        System.out.println("Eliminamos la persona que se agregó primero a la cola (EDUARDO)");
        cola1.removeFirst();

        // Mostramos la cola usando un iterador
        Iterator<Persona> it=cola1.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}