public class Principal {
    public static void main(String[] args) {
        //        for (char c='0'; c<=(int)'Z' ; c++)
        //            System.out.printf("'%c'=%d\n", c, (int)c);
        //        System.out.printf("'%c'=%d\n", 'Ñ', (int)'Ñ');
//        System.out.printf("\"A=%d\".compareTo(\"A=%d\") = %d\n", (int)'A', (int)'A',
//            "A".compareTo("A"));
//        System.out.printf("\"A=%d\".compareTo(\"H=%d\") = %d\n", (int)'A', (int)'H',
//            "A".compareTo("H"));
//        System.out.printf("\"H=%d\".compareTo(\"A=%d\") = %d\n", (int)'H', (int)'A',
//            "H".compareTo("A"));
        System.out.printf("\"COLA\".compareTo(\"COLA\") = %d\n", "COLA".compareTo("COLA"));
        System.out.printf("\"COLA\".compareTo(\"COPA\") = %d\n", "COLA".compareTo("COPA"));
        System.out.printf("\"COPA\".compareTo(\"COLA\") = %d\n", "COPA".compareTo("COLA"));
        System.out.printf("\"COPAS\".compareTo(\"COLA\") = %d\n", "COPAS".compareTo("COPA"));
    }
}