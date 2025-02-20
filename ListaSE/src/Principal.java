public class Principal {
    public static void main(String[] args) {
        ListaSE lista2=new ListaSE();
        Nodo n10=new Nodo(10);
//        System.out.println("Insertar antes del nodo 10 el nodo 10 con la lista vacía");
//        System.out.println(lista2.insertarAntes(n10, n10));
        System.out.println("Creamos una lista de 5 elementos");
        for (int i = 0; i < 5; i++)
            lista2.agregar(new Nodo(i));
        System.out.println(lista2);
        Nodo n0=lista2.get(0);
        System.out.printf("Elemento 0: %s\n", n0);
//        System.out.println("Insertamos el nodo 10 antes del nodo 0");
//        lista2.insertarAntes(n10, n0);
//        System.out.println(lista2);
        System.out.println("Insertamos el nodo 10 antes del nodo 2");
        Nodo n2=lista2.get(2);
        lista2.insertarAntes(n10, n2);
        System.out.println(lista2);
    }

    private static void m1() {
        ListaSE lista1=new ListaSE();
        for (int i=0; i<10 ; i++)
            lista1.agregar(new Nodo(i));
        System.out.println(lista1);
        // System.out.println(new ListaSE());
        Nodo n5=new Nodo(5);
        System.out.printf("El nodo %s %s en la lista\n",
            n5, lista1.buscar(n5) ? "está" : "no está");
        Nodo n10=new Nodo(10);
        System.out.printf("El nodo %s %s en la lista\n",
            n10, lista1.buscar(n10) ? "está" : "no está");
    }
}