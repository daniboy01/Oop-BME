import java.util.ArrayList;

public class Delete extends Command {
    public Delete(String name) {
        super(name);
    }

    @Override
    void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd.length == 1){
            System.out.println("Adjon meg törlési paramétert!");
            return;
        }
        String param = cmd[1];
        for (int i = 0; i < beers.size(); i++) {
            Beer b = beers.get(i);
            if (b.getName().equals(param)){
                beers.remove(b);
            }
        }
    }
}
