public class Principal {
    private static String jugador1="";
    private static String jugador2="";
    private static int filas=0;
    private static int columnas=0;

    public static void main(String[] args) {
        if (args.length==0) {
            uso();
            System.exit(1);
        }

        switch (args.length) {
            case 4:
                columnas=Integer.parseInt(args[3]);
            case 3:
                filas=Integer.parseInt(args[2]);
            case 2:
                jugador2=args[1];
            case 1:
                jugador1=args[0];
                break;
            default:
                uso();
                System.exit(1);
        }

        System.out.printf("Jugador 1: %s\n", jugador1);
        System.out.printf("Jugador 2: %s\n", jugador2);
        System.out.printf("Filas    : %d\n", filas);
        System.out.printf("Columnas : %d\n", columnas);
    }

    private static void uso() {
        System.out.println("Uso: Principal jugador1 [jugador2] [filas] [columnas]");
    }
}