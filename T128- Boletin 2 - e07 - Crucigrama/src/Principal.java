public class Principal {
    public static void main(String[] args) {
        Casilla c1=new Casilla();
        if (c1.colocar('Ñ'))
            System.out.printf("He colocado la letra Ñ en la casilla %s", c1);
        else
            System.out.printf("No he podido colocar la letra Ñ en la casilla %s", c1);
        System.out.println(new Tablero());

    }
}