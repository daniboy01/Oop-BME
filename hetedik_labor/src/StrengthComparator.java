import java.util.Comparator;

public class StrengthComparator implements Comparator<Beer> {
    @Override
    public int compare(Beer beer, Beer t1) {
        double s1 = beer.getStrength();
        double s2 = t1.getStrength();
        if (s1 < s2) return -1;
        if (s1 > s2) return 1;
        return 0;
    }
}
