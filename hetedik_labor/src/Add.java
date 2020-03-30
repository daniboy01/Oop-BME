import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Add extends Command {

    public Add(String name) {
        super(name);
    }

    @Override
    void action(ArrayList<Beer> beers, String[] cmd) {
        beers.add(new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3])));
    }
}
