public class Principal
{
    public static void main(String[] args) {
        String s1="HOLA";
        String s2="HOLA";
        String s3=new String("HOLA");
        boolean b1=(s1==s2);
        boolean b2=s1.equals(s2);
        boolean b3=(s1==s3);
        boolean b4=s1.equals(s3);
        System.out.printf("s1==s2 %b\ns1.equals(s2) %b\ns1==s3 %b\ns1.equals(s3) %b\n",
            b1, b2, b3, b4);
    }  
}
