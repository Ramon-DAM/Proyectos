public class Principal
{
    public static void main(String[] args) {
        for (int i=mostrar1('A'); 
                i<=5 && mostrar2('B'); 
                    i++, mostrar2('C'))
            mostrar2('D');
    }
    
    private static int mostrar1(char c) {
        System.out.print(c);
        return 1;
    }
    
    private static boolean mostrar2(char c) {
        System.out.print(c);
        return true;
    }
}