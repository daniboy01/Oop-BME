import java.util.Comparator;

public class StyleComparator implements Comparator<Beer> {
    @Override
    public int compare(Beer beer, Beer t1) {
        String s1 = beer.getStyle();
        String s2 = t1.getStyle();
        return s1.compareTo(s2);
    }
}
