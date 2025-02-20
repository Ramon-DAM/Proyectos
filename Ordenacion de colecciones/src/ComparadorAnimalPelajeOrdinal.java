import java.util.Comparator;

public class ComparadorAnimalPelajeOrdinal
    implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getPelaje().ordinal()-o2.getPelaje().ordinal();
    }
}
