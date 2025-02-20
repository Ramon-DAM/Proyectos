import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Ordenador {
    private static final int MAX_MODULOS_RAM=4;
    @NotNull
    private PlacaBase placaBase;        // NO NULO
    @NotNull
    private Teclado teclado;            // NO NULO
    private ModuloRAM[] modulosRAM;

    public Ordenador() {
        this.placaBase=new PlacaBase();
        this.teclado=new Teclado();
        modulosRAM=new ModuloRAM[MAX_MODULOS_RAM];
        agregarModulosRAM(1);
    }

    public int getMaxModulosRam() {
        return MAX_MODULOS_RAM;
    }

    public boolean agregarModulosRAM(int n) {
        assert n>=1 && n<=MAX_MODULOS_RAM:
            ("No es posible agregar %d módulos RAM. "
            + "Sólo se puede agregar como mínimo 1 módulo y como máximo %d")
                .formatted(n,MAX_MODULOS_RAM);
        if (numModulos()+n>MAX_MODULOS_RAM)
            return false;
        for (int i = 0; i < n; i++)
            if (modulosRAM[i]==null)
                modulosRAM[i]=new ModuloRAM();
        return true;
    }

    public boolean quitarModulosRAM(int n) {
        assert n>=1 && n<=MAX_MODULOS_RAM:
            ("No es posible quitar %d módulos RAM. "
                + "Sólo se puede quitar como mínimo 1 módulo y como máximo %d")
                .formatted(n,MAX_MODULOS_RAM);
        if (n>=numModulos())
            return false;
        for (int i = 0; i < n; i++)
            if (modulosRAM[i]!=null)
                modulosRAM[i]=null;
        return true;
    }

    public int numModulos() {
        int contador=0;
        for (int i = 0; i < modulosRAM.length; i++)
            if (modulosRAM[i]!=null)
                contador++;
        return contador;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
            "placaBase=" + placaBase +
            ", teclado=" + teclado +
            ", modulosRAM=" + Arrays.toString(modulosRAM) +
            '}';
    }
}
