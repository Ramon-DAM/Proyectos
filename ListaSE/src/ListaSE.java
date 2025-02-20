import org.jetbrains.annotations.NotNull;

public class ListaSE {
    private Nodo inicio;

    public ListaSE() {
        inicio=null;
    }

    public void agregar(@NotNull Nodo nodo) {
        if (estaVacia())
            inicio=nodo;
        else {
            Nodo aux=inicio;
            while (aux.getSgte()!=null)
                aux=aux.getSgte();
            aux.setSgte(nodo);
        }
    }

    public boolean buscar(@NotNull Nodo nodo) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.equals(nodo))
                return true;
            aux = aux.getSgte();
        }
        return false;
    }

    public boolean estaVacia() {
        return inicio==null;
    }

    // Si la lista está vacía -> Error
    // Si la posición no existe -> Error
    public Nodo get(int pos) {
        assert pos>=0: "La posición debe ser >=0 [pos=%d]".formatted(pos);
        assert !estaVacia():
            "La lista está vacía. No es posible obtener el elemento %d".formatted(pos);
        Nodo aux=inicio;
        int i=0;
        while (aux!=null)
            if (pos == i)
                return aux;
            else {
                aux = aux.getSgte();
                i++;
            }
        if (pos>i)
            assert false: "La posición debe ser <=%d [pos=%d]".formatted(i-1, pos);
        System.err.println("La ejecución del programa no debería llegar aquí");
        System.exit(1);
        return null;
    }

    // Si la lista está vacía -> Error
    // Devuelve:
    //      true    El nuevo nodo se ha insertado
    //      false   No se inserta el nuevo nodo porque no existe el nodo recibido como segundo parámetro
    public boolean insertarAntes(@NotNull Nodo nuevo, @NotNull Nodo nodo) {
        // Lista vacía. No puedo insertar nada
        if (estaVacia())
            return false;

        // El primer nodo (nodo 0) es el nodo que estoy buscando
        if (inicio==nodo) {
            nuevo.setSgte(inicio);
            inicio=nuevo;
            return true;
        }

        // El primer nodo no es el que estoy buscando
        Nodo aux=inicio;
        while (aux.getSgte()!=nodo) {
            if (aux.getSgte()==null)
                return false;
            aux=aux.getSgte();
        }
        // Inserto el nuevo nodo antes del nodo buscado
        nuevo.setSgte(aux.getSgte());
        aux.setSgte(nuevo);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        Nodo aux=inicio;
        while (aux!=null) {
            sb.append(aux);
            if (aux.getSgte()!=null)
                sb.append("->");
            aux = aux.getSgte();
        }
        return sb.toString();
    }
}
