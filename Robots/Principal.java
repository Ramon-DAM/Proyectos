public class Principal {
    public static void main(String[] args) {
        Robot r1=new Robot("MAZINGUER-Z");
        r1.setPeso(25000);
        Robot r2=new Robot();
        Robot r3=new Robot("AFRODITA-A", 27000);        
        System.out.println("r1="+r1+'\n'+"r2="+r2+'\n'+"r3="+r3);
        // Mostrar la longitud del apodo de cada robot
        /* System.out.println("Longitud apodo r1="+r1.getApodo().length());
        System.out.println("Longitud apodo r2="+r2.getApodo().length()); */
        // r2.setApodo("AFRODITA_A");
    }
}