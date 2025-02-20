import org.jetbrains.annotations.NotNull;

public class Ficha {
    private TipoFicha tipoFicha;        // NO NULO, NO MODIFICABLE

    public Ficha(TipoFicha tipoFicha) {
        setTipoFicha(tipoFicha);
    }

    private void setTipoFicha(@NotNull TipoFicha tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    @Override
    public String toString() {
        return tipoFicha.toString();
    }
}
