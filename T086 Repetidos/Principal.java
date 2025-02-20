public class Principal
{
    public static void main(String[] args) {
        // System.out.println(repetidos3("PARAPETAR"));    // PARET
        // System.out.println(repetidos3(""));             // ""
        // System.out.println(repetidos3("PATATA"));       // PAT
        System.out.println(repetidos2("PATATA"));          // AT        
        System.out.println(repetidos2("BOCATA"));          // A
    }
    
    // repetidos1 ==> Regalo para el alumnado
    
    // Devuelve una cadena con los caracteres repetidos que hay en la cadena recibida
    // (la cadena devuelta no tendrá caracteres repetidos)
    private static String repetidos2(String s) {
        // VALIDACIÓN DE NULIDAD
        StringBuffer r=new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            char actual=s.charAt(i);
            if  (s.substring(i+1).indexOf(actual)>=0        // Está repetido en s
                && r.indexOf(String.valueOf(actual))==-1)   // Y no está en r
                r.append(actual);
        }
        return r.toString();
    }
    
    
    // Devuelve los caracteres de s sin repetición
    private static String repetidos3(String s) {
        // VALIDACIÓN DE NULIDAD
        String r="";       // Caracteres sin repetición
        for (int i=0; i<s.length(); i++) {
            char actual=s.charAt(i);    
            if (r.indexOf(actual)==-1)
                r=r+actual;
        }
        return r;
    }
}
