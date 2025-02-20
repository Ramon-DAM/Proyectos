public class Principal
{
    public static void main(String[] args) {
        triangulo(10,'\u263B');
    }
    
    // Muestra un triángulo de la altura recibida usando el carácter c
    // Usar el depurador para ver la ejecución y el valor de las variables en cada paso
    private static void triangulo(int altura, char c) {
        assert altura>=1:
            "La altura del triángulo debe ser >=1 [altura=%d".formatted(altura);
        for (int i=1; 
                i<=altura; 
                    i++) {
            int longitud=i*2-1;
            // Relleno
            for (int k=1; 
                    k<=altura-i; 
                        k++)  
                System.out.print('-');
            // Dibujar línea de caracteres
            for (int j=1; 
                    j<=longitud; 
                        j++)
                System.out.print(c);
            System.out.println();
        }
    }
}