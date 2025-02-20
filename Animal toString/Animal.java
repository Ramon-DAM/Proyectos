public class Animal
{
   private String apodo;
   private int peso;            // Kg
   
   public Animal(String apodo, int peso) {    
        this.apodo=apodo;
        this.peso=peso;
   } 
   
   // Dos animales son iguales si tienen el mismo apodo y el mismo peso
   public boolean equals(Object o) {
       Animal animal=(Animal)o;
       return apodo.equals(animal.apodo) && peso==animal.peso;
   }
   
   public String toString() {
       return String.format("%s (%d Kg)", apodo, peso);
   }
}
