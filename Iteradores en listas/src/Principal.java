import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {
//        m1();
        m2();
    }

    private static void m2() {
//        ArrayList<Integer> lista1=new ArrayList<>();
        LinkedList<Integer> lista1=new LinkedList<>();
        for (int i = 0; i < 10 ; i++)
            lista1.add(i);

        // Mostrar la lista usando listIterator
        ListIterator<Integer> lit=lista1.listIterator();
        while (lit.hasNext()) {
            Integer i = lit.next();
            if (i == 5)
                lit.set(i=7);
            System.out.printf("[%d]", i);
        }
        System.out.println();
        while (lit.hasPrevious()) {
            Integer i=lit.previous();
            if (i==7) {
                System.out.printf("[%d]", i);
                lit.add(i = 0);
                lit.previous();
            }
            System.out.printf("[%d]", i);
        }
        System.out.println();
        while (lit.hasNext())
            System.out.printf("[%d]", lit.next());
        System.out.println();
    }

    private static void m1() {
        ArrayList<Integer> lista1=new ArrayList<>();
        for (int i = 0; i < 10 ; i++)
            lista1.add(i);

        // Mostrar la lista por pantalla usando for
        for (int i = 0; i < lista1.size(); i++)
            System.out.print(lista1.get(i));
        System.out.println();

        // Mostrar la lista usando for mejorado (for each)
        for (int e: lista1)
            System.out.print(e);
        System.out.println();

        // Mostrar la lista usando un iterador
        Iterator<Integer> it=lista1.iterator();
        while (it.hasNext()) {
            int aux = it.next();
            if (aux==5)
                //                lista1.remove(aux);
                it.remove();
            else
                System.out.print(aux);
        }
    }
}