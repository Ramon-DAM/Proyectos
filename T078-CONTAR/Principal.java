public class Principal
{
    public static void main(String[] args) {
        String s1="PA";
        String s2="PATATA";
        System.out.printf("En el texto %s aparecen los caracteres %s, %d veces\n",
            s2, s1, contar(s1, s2));            
    }
    
    private static int contar(String caracteres, String texto) {
        // VALIDACIÓN NO NULIDAD
        assert !hayRepetidos(caracteres):
            String.format("No pueden haber caracteres repetidos [caracteres=%s]",
                caracteres);
        int contador=0;
        for (int i=0; 
                i<texto.length(); 
                    i++)
            for (int j=0; 
                    j<caracteres.length(); 
                        j++) {
                char c=caracteres.charAt(j);
                if (c==texto.charAt(i))
                    contador++;
            }
        return contador;
    }
    
    private static boolean hayRepetidos(String s) {
        // VALIDACIÓN NO NULIDAD
        for (int i=0; i<s.length()-1; i++) {
            char c=s.charAt(i);
            if (s.substring(i+1).indexOf(c)>=0)
                return true;
        }
        return false;    
    }    
}






