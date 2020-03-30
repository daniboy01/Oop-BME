import java.util.Comparator;

public class NameComparator implements Comparator<Beer> {
    @Override
    public int compare(Beer beer, Beer t1) {
        String n1 = beer.getName();
        String n2 = t1.getName();
        return n1.compareTo(n2);
    }
}
