public class Principal
{
    public static void main(String[] args) {
        // System.out.println(palindromo(null));
        System.out.println(palindromo(""));             // true
        System.out.println(palindromo("A"));            // true
        System.out.println(palindromo("RECONOCER"));    // true
        System.out.println(palindromo("PATATA"));       // false
    }
    
    private static boolean palindromo(String s) {
        assert s!=null: "La cadena s no puede ser nula";
        for (int i=0, j=s.length()-1; i<j; i++, j--)
            if (s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
}