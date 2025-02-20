import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
//        m1();
        m2();
    }

    // Pila usando Stack
    // La clase Stack está desaconsejada (deprecated). Ya obsoleta. No se debe usar
    // Para implementar pilas se deben usar clases como: ArrayDeque o LinkedList
    private static void m2() {
        ArrayDeque<Character> pila1=new ArrayDeque<>();
        String nombre="EDUARDO";
        System.out.println(nombre);
        for (int i = 0; i < nombre.length(); i++)
            pila1.push(nombre.charAt(i));
        while (!pila1.isEmpty())
            System.out.print(pila1.pop());
    }

    // Pila usando LinkedList
    private static void m1() {
        LinkedList<Character> pila1=new LinkedList<>();
        String nombre="EDUARDO";
        System.out.println(nombre);
        for (int i = 0; i < nombre.length(); i++)
            pila1.push(nombre.charAt(i));
        while (!pila1.isEmpty())
            System.out.print(pila1.pop());
    }
}