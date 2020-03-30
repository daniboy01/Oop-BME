import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class List extends Command {
    public List(String name) {
        super(name);
    }

    @Override
    void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd.length == 1) {
            for(Beer b : beers) System.out.println(b.toString());
            return;
        }
        switch (cmd[1]){
            case "name":
                Collections.sort(beers,new NameComparator());
                break;
            case "style":
                Collections.sort(beers,new StyleComparator());
                break;
            case "strength":
                Collections.sort(beers,new StrengthComparator());
                break;
        }
        for(Beer b : beers) System.out.println(b.toString());
    }
}
