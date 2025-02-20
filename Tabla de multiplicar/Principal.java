public class Principal
{
    public static void main(String[] args) {
        /* for (int i=1; i<=10; i++) {
            tablaMul(i);            
            System.out.println();
        } */
        tablasMul(8);
    }
    
    // Muestra las tablas de multiplicar del 1 a n
    // Usando for anidado
    private static void tablasMul(int n) {
        assert n>=1:
            "La tabla de multiplicar debe ser de n>=1 [n=%d]".formatted(n);
        for (int i=1; i<=n; i++) {
            String titulo="Tabla de multiplicar del %d".formatted(n);
            System.out.println(titulo);
            System.out.println("=".repeat(titulo.length()));            
            for (int j=1; j<=10; j++)
                System.out.printf("%dx%d=%d\n", i, j, i*j);
            System.out.println();
        }
    }
    // Muestra la tabla de multiplicar de n
    private static void tablaMul(int n) {
        assert n>=1:
            "La tabla de multiplicar debe ser de n>=1 [n=%d]".formatted(n);
        String titulo="Tabla de multiplicar del %d".formatted(n);
        System.out.println(titulo);
        System.out.println("=".repeat(titulo.length()));
        for (int i=1; i<=10; i++)
            System.out.printf("%dx%d=%d\n", n, i, n*i);
    }
}