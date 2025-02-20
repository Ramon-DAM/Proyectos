public class Principal
{
    public static void main(String[] args) {
        System.out.println(contar('A',"ANIMAL", 'L'));  // 0
        System.out.println(contar('A',"PATATA", 'T'));  // 2
        System.out.println(contar('A',"PATATA", 'P'));  // 3
        System.out.println(contar('A',"PATATA", 'Q'));  // 0
        System.out.println(contar('A', "", 'T'));       // 0
        // System.out.println(contar('A', null, 'T'));  // Error
        System.out.println(contar('X', "PATATA", 'T')); // 0   
    }

    // Cuenta las apariciones del carácter c DESPUÉS del carácter maldito
    private static int contar(char c, String cadena, char maldito) {
        assert cadena!=null: "La cadena no puede ser nula";
        assert c!=maldito:
            String.format("El carácter c debe ser distinto al carácter maldito [c=%c]", c);
        int contador=0;
        boolean hayMaldito=false;
        for (int i=0; i<cadena.length(); i++) {
            char actual=cadena.charAt(i);
            if (actual==maldito) {
                hayMaldito=true;
                continue;              // No es necesario. Solo se usar por requisitos
                                       // del enunciado 
            } else if (actual==c && hayMaldito)
                contador++;
        }
        return hayMaldito ? contador : 0;

    }
}