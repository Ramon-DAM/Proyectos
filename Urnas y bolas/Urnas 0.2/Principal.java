// Urnas 0.2
public class Principal
{
    public static void main(String[] args) {
        // a. Crear 4 bolas de 2 formas distintas (constructor, generar)
        Bola bola1=new Bola("AZUL");
        Bola bola2=new Bola("VERDE");
        Bola bola3=Bola.generar();
        Bola bola4=Bola.generar();        
        
        // b. Crear 3 urnas
        Urna u1=new Urna();
        Urna u2=new Urna();
        Urna u3=new Urna();
        
        // c. Agregar 3 bolas a la primera urna y 2 bolas a la segunda urna
        u1.agregar();
        u1.agregar(new Bola("AZUL"));
        u1.agregar("ROJO");
        u2.agregar(Bola.generar());
        u2.agregar(bola2);        
            
        // d. Mostrar el número de una bola
        System.out.println("El número de la bola 1 es: "+bola1.getNumero());
        
        // e. Mover una bola de color AZUL de la primera urna a la segunda
        u2.agregar(u1.sacar("AZUL"));
        
        // f. Llenar la tercera urna
        u3.llenar();
        
        // g. Sacar aleatoriamente una bola de la urna 3
        u3.sacar();
        
        // h. Mostrar el numero de bolas de la urna 3
        System.out.println(u3.numBolas());
        
        // i. Mostrar el numero total de bolas contenidas en las 3 urnas
        System.out.println("Número de bolas total en las 3 urnas: "
            +(u1.numBolas()+u2.numBolas()+u3.numBolas()));        
        
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    } 
}
