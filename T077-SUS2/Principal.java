public class Principal
{
    public static void main(String[] args) {
        System.out.println(sus2('A','I',"PATATA"));    
        System.out.println(sus2('X','I',"PATATA"));    
    }

    private static String sus2(char original, char nuevo, String cadena) {
        // VALIDACIÓN
        int contador=0;     // Nº de apariciones de original en cadena
        String r="";
        for (int i=0; i<cadena.length(); i++) {
            char c=cadena.charAt(i);
            if (c==original) {
                contador++;
                if (contador==2)
                    r+=nuevo;
                else
                    r+=c;
            } else
                r+=c;            
        }
        return r;
    }
}
