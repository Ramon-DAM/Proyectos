public class Principal {
    public static void main(String[] args) {
        Nodo<Integer> n1 = new Nodo<>(1);
        Nodo<Integer> n2 = new Nodo<>(2);
        Nodo<Bola> n3 = new Nodo<>(new Bola(3, Color.VERDE));
        System.out.printf("n1=%s n2=%s n3=%s\n", n1, n2, n3);
    }
}