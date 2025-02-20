public class Principal {
    public static void main(String[] args) {
        Tablero t1=new Tablero(5);
        System.out.println(t1);
        t1.colocar(new Robot());
        t1.colocar(new Robot());
        System.out.println(t1);
    }
}