public class Principal
{
    public static void main(String[] args) {
        System.out.println(contar('A',"ANIMAL", 'L'));  // 2
        System.out.println(contar('A',"PATATA", 'T'));  // 1
        System.out.println(contar('A',"PATATA", 'P'));  // 0
        System.out.println(contar('A',"PATATA", 'Q'));  // 0
        System.out.println(contar('A', "", 'T'));       // 0
        // System.out.println(contar('A', null, 'T'));  // Error
        System.out.println(contar('X', "PATATA", 'T')); // 0
    }
    
    private static int contar(char c, String cadena, char maldito) {
        assert c!=maldito: 
            String.format("El caracter a contar no puede ser igual que el caracter maldito [caracter=%c]", 
                c);
        assert cadena!=null: "La cadena no puede ser nula";
        int contador=0;
        boolean hayMaldito=false;
        for (int i=0; i<cadena.length(); i++) {
            char actual=cadena.charAt(i);
            if (actual==maldito) {
                hayMaldito=true;
                break;
            } else if (actual==c)
                contador++;
        }
        return hayMaldito ? contador : 0;
    }
}
