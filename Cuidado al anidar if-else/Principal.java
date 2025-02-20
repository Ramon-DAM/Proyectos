public class Principal
{
    public static void main(String[] args) {
        System.out.printf("m1(false, false) =%d\n", m2(false, false));
        System.out.printf("m1(false, true)  =%d\n", m2(false, true));
        System.out.printf("m1(true,  false) =%d\n", m2(true, false));
        System.out.printf("m1(true,  true)  =%d\n", m2(true, true));
    }

    private static int m1(boolean cond1, boolean cond2) {        
        int a=0;
        if (cond1) 
            if (cond2) 
                a=2; 
            else 
                a=1; 
        return a;
    }    
        
    private static int m2(boolean cond1, boolean cond2) {        
        int a=0;
        if (cond1) {
            if (cond2) 
                a=2; 
        } else 
            a=1;
                
        return a;
    }
    
    
}