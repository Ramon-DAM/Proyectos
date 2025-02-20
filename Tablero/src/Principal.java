public class Principal {
    public static void main(String[] args) {
//        Casilla c1=new Casilla();
//        c1.colocar(new Ficha(TipoFicha.O));
        Tablero t1=new Tablero(7,5);
        System.out.println(t1);
        t1.colocar(new Ficha(TipoFicha.O), 3, 2);
        t1.colocar(new Ficha(TipoFicha.X), 0, 2);
        t1.colocar(new Ficha(TipoFicha.O), 4, 4);
        System.out.println(t1);
    }
}