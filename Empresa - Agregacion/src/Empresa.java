import org.jetbrains.annotations.NotNull;

public class Empresa {
    @NotNull
    private String nombre;          // NO BLANCO, NO MODIFICABLE
    private Empleado[] empleados;   // <<R>>
    @NotNull
    private Empleado fundador;      // <<R>>

    public Empresa(@NotNull String nombre, @NotNull Empleado fundador, int max) {
        assert max>=1: "El número máximo de empleados debe ser >=1 [max=%d]".formatted(max);
        this.nombre = nombre;
        this.empleados=new Empleado[max];
        this.fundador = empleados[0] = fundador;
    }

    private void setNombre(@NotNull String nombre) {
        assert !nombre.isBlank(): "El nombre no puede estar vacío [nombre=%s]".formatted(nombre);
        this.nombre = nombre;
    }

    public boolean contratar(@NotNull Empleado empleado) {

    }
}
