public class Animal
{
   private static final String APODO_POR_DEFECTO="ANIMAL";  // Apodo por defecto de un animal
   private static final int MAX_LONGITUD=3;                 // Longitud máxima del apodo
   private String apodo;                                    // NO NULO, NO VACIO, NO BLANCO, LONGITUD>=3
   private int peso;                                        // >=0, Kg
      
   public Animal() {
       setApodo(APODO_POR_DEFECTO);
       setPeso(0);
   }
   
   public Animal(String apodo) {
       setApodo(apodo);
       setPeso(0);        
   }
   
   public Animal(int peso) {
       setApodo(APODO_POR_DEFECTO);
       setPeso(peso);                
   }
   
   public Animal(String apodo, int peso) {
       setApodo(apodo);
       setPeso(peso);
   }

   /* public Animal(String apodo, int altura) {
       setApodo(apodo);
       setPeso(peso);
   } */
   
   public String getApodo() {
       return apodo;
   }
   
   public void setApodo(String apodo) {
       assert apodo!=null: 
           String.format("El apodo no puede ser nulo [apodo=%s]", apodo);       
       assert !apodo.isBlank():
           String.format("El apodo no puede estar vacío ni ser blanco [apodo=%s]",
               apodo);
       assert apodo.length()>=MAX_LONGITUD:
           String.format("El apodo debe tener longitud >=%d [apodo=%s longitud=%d]",
               MAX_LONGITUD, apodo, apodo.length());
       this.apodo=apodo;
   }
   
   public void setPeso(int peso) {
       assert peso>=0: String.format("El peso debe ser >=0 [peso=%d]", peso);
       this.peso=peso;
   }
   
   public void comer() {
       System.out.printf("[%s] Estoy comiendo", apodo);
   }
   
   // cantidad de comida (Kg)
   public void comer(float cantidad) {
       System.out.printf("[%s] He comido %.1f Kg de comida. ¡Qué rico!\n", apodo, cantidad);       
   }
   
   public String toString() {
       return String.format("%s (%d Kg)", apodo, peso);
   }
}
