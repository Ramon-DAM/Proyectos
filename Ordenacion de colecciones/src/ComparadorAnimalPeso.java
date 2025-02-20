import java.util.Comparator;

public class ComparadorAnimalPeso
    implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getPeso()-o2.getPeso();
    }
}
