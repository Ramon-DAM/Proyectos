public class Principal {
    public static void main(String[] args) {
        Publicacion p=new Publicacion();
        Revista r=new Revista();
        Libro l=new Libro();
        p=l;
        System.out.printf("Variable p -> Tipo estático=%s Tipo dinámico=%s\n",
            "Publicacion", p.getClass().getName());
        System.out.printf("p=%s\n", p);
//        l=p;
//        r=l;
//        r=(Revista)p;
//        System.out.println(p);
//        System.out.printf("r=%s\n", r);
    }
}