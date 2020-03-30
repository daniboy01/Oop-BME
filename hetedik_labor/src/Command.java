import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public abstract class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void action(ArrayList<Beer> beers, String[] cmd);
}
