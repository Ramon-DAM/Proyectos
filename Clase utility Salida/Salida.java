public class Salida
{
    private Salida() {}
    
    public static void mensaje(String mensaje) {
        System.out.print(mensaje);
    }
    
    public static void mensajeln(String mensaje) {
        System.out.println(mensaje);
    }
    
    public static void error(String mensaje) {
        System.err.println(mensaje);
    }
    
    public static void log(String mensaje) {
        // Este mensaje debería de escribirse en un fichero log
        System.out.println(mensaje);
    }    
}
