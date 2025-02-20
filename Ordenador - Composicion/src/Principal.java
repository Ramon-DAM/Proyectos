public class Principal {
    public static void main(String[] args) {
        Ordenador o1=new Ordenador();
        Ordenador o2=new Ordenador();
        if (!o2.agregarModulosRAM(3))
            System.out.println("No ha sido posible agregar 3 módulos de RAM al ordenador 2");
        System.out.printf("El ordenador 2 tiene instalados %d módulos de RAM", o2.numModulos());
        System.out.println("Ordenador 1: "+o1);
        System.out.println("Ordenador 2: "+o2);
        System.out.println("Quitamos 1 módulo de RAM del ordenador 1");
        if (!o1.quitarModulosRAM(1))
            System.out.println("No ha sido posible quitar 1 módulo de RAM al ordenador 1");
        System.out.println("Ordenador 1: "+o1);
        System.out.println("Quitamos 2 módulos de RAM del ordenador 2");
        if (!o2.quitarModulosRAM(2))
            System.out.println("No ha sido posible quitar 2 módulos de RAM al ordenador 2");
        System.out.println("Ordenador 2: "+o2);
    }
}