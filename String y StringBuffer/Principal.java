public class Principal
{
    public static void main(String[] args) {
        System.out.println(m1());    
    }
    
    private static String m1() {
        StringBuffer sb=new StringBuffer();
        sb.append("PATATA");
        sb.replace(2,4,"NCE");
        // sb.deleteCharAt(0);
        return sb.toString();    
    }
}