import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        m1();
//        m2();
        m3();
    }

    // LinkedList de tipo Bola
    private static void m3() {
        LinkedList<Bola> bolas1=new LinkedList<>();
        for (int i = 1; i <= 10 ; i++)
            bolas1.add(new Bola(i, Color.AZUL));
        System.out.println(bolas1);
        Bola b99=new Bola(99, Color.VERDE);
        System.out.printf("Insertamos la bola %s en la lista bolas1 en la posición 2", b99);
        bolas1.add(2, b99);
        System.out.println(bolas1);
        System.out.printf("¿La lista bolas1 contiene la bola %s? %s\n",
            b99, bolas1.contains(b99) ? "SI" : "NO");
        System.out.println("FIN");
    }

    // ArrayList de tipo Bola
    private static void m2() {
        ArrayList<Bola> bolasAzules=new ArrayList<>();
        ArrayList<Bola> bolasRojas=new ArrayList<>();
        for (int i = 1; i <= 4; i++)
            bolasAzules.add(new Bola(i, Color.AZUL));
        for (int i = 1; i <= 7; i++)
            bolasRojas.add(new Bola(i, Color.ROJO));
        System.out.println(bolasAzules);
        System.out.println(bolasRojas);
        Bola b1=new Bola(3, Color.AZUL);
        System.out.printf("¿Existe una bola que sea igual (número y color) a la bola %s en la lista de bolas azules? ",
            b1);
        System.out.println(bolasAzules.contains(b1) ? "SI" : "NO");
        Bola b2=bolasRojas.get(3);
        System.out.printf("¿Cuál es la posición de la bola %s en la lista de bolas rojas? %d", b2,
            bolasRojas.indexOf(b2));
    }

    // ArrayList de tipo Integer
    private static void m1() {
        ArrayList<Integer> lista1=new ArrayList<>();
        for (int i = 0; i <= 10; i++)
            lista1.add(i);
        System.out.println(lista1);
        lista1.add(2, 10);
        System.out.println(lista1);
        lista1.set(0,99);
        System.out.println(lista1);
        lista1.clear();
        System.out.println(lista1);
    }
}