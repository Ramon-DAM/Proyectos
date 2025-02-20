public enum Pelaje {
    CLARO(0), MIXTO(1), OSCURO(3), RIZADO(2);
    private int grado;

    Pelaje(int grado) {
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }
}
