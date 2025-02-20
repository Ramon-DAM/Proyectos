import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu() {
        boolean salir=false;        
        Scanner sc=new Scanner(System.in);
        do {
            mostrarOpciones();
            System.out.print("Elija una opción: ");
            int opcion=sc.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println("Mostrar Usos...");
                    break;
                case 2: 
                    System.out.println("Mostrar Herencia...");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Opción no implementada aún...");
                    break;
                case 0:
                    salir=true;
                    break;
                default:
                    System.out.printf("Opción incorrecta [opcion=%d]", 
                        opcion);
            }
        } while (!salir);
        System.out.println("¡Fin del programa!");
    }

    private static void mostrarOpciones() {
        String titulo="MENU PRINCIPAL";
        System.out.println("-".repeat(titulo.length()));
        System.out.println(titulo);
        System.out.println("-".repeat(titulo.length()));
        System.out.println("1-Mostrar Usos");
        System.out.println("2-Mostrar Herencia");        
        System.out.println("-".repeat(20));
        System.out.println("3-Mostrar Depurador\t\tCtrl+D");
        System.out.println("4-Mostrar Terminal\t\tCtrl+T");
        System.out.println("5-Mostrar Bloc de Código\tCtrl+E");
        System.out.println("6-Mostrar Resultados de Prueba");
        System.out.println("0-Salir");
        System.out.println();    
    }
    
}