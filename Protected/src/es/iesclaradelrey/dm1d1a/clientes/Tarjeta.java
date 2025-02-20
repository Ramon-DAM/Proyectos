package es.iesclaradelrey.dm1d1a.clientes;

public class Tarjeta {
    private static int contador=0;
    private int numero;

    public Tarjeta(int numero) {
        this.numero = ++contador;
    }

    @Override
    public String toString() {
        return Integer.toString(numero);
    }
}
