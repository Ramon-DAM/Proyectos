import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("¿Cuántas personas hay en la habitación? ");
        int numPersonas=sc.nextInt();
        int[][] edades=new int[numPersonas][];
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("¿Cuántos hijos tiene la persona %d? ", i);
            int numHijos=sc.nextInt();
            edades[i]=new int[numHijos];
            for (int j = 0; j < edades[i].length; j++) {
                System.out.printf("¿Cúal es la edad del hijo %d de la persona %d? ", j, i);
                int edad=sc.nextInt();
                edades[i][j]=edad;
            }
        }

        // Mostrar edades
        for (int i = 0; i < edades.length; i++) {
            if (edades[i].length == 0)                                // Sin hijos
                System.out.printf("La persona %d no tiene hijos", i);
            else {
                System.out.printf("La persona %d tiene %d hijos y sus edades son: ", i, edades[i].length);
                System.out.print(edades[i][0]);
            }
            for (int j = 1; j < edades[i].length; j++) {
                System.out.print(", "+edades[i][j]);
            }
            System.out.println();
        }
    }
}