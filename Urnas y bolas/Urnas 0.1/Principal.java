
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
        
        // c. Agregar 3 bolas a la primera urna
        for (int i=1; i<=3; i++)
            u1.agregar(new Bola("AZUL"));
            // u1.agregar(Bola.generar());
            
        // d. Mover una bola de color AZUL de la primera urna a la segunda
        // Bola bolaAzul=u1.sacar("AZUL");
        u2.agregar(u1.sacar("AZUL"));
        
    } 
}
