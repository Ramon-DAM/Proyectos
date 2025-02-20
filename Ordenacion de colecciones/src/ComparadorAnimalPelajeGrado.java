import java.util.Comparator;

public class ComparadorAnimalPelajeGrado
    implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getPelaje().getGrado()-o2.getPelaje().getGrado();
    }
}
