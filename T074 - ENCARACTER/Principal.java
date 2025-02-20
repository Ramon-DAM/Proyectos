public class Principal
{
    public static void main(String[] args) {
        int contador=0;
        for (char c='A'; c<='Z'; c++) {
            boolean encontrado=en(c,"NOVIEMBRE");
            if (encontrado)
                contador++;            
            System.out.printf("¿El caracter %c está en la palabra NOVIEMBRE? %s\n",
               c, encontrado ? "SI" : "NO");
        }
        System.out.printf("Se han encontrado %d caracteres\n", contador);
    }
    
    private static boolean en(char caracter, String cadena) {
        // assert cadena no es nulo
        boolean encontrado=false;
        for (int i=0; i<cadena.length(); i++)
            if (caracter==cadena.charAt(i)) {
                encontrado=true;
                break;
            }
        return encontrado;
    }
}