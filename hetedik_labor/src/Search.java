import java.util.ArrayList;

public class Search extends Command {
    public Search(String name) {
        super(name);
    }

    @Override
    void action(ArrayList<Beer> beers, String[] cmd) {
        if (cmd.length == 1){
            System.out.println("Adjon meg keresési paramétert!");
            return;
        }
        if (cmd.length == 3){
            String keyword = cmd[1];
            String param = cmd[2];
            listByParam(beers,keyword,param);
        }

        String param = cmd[1];
        for (Beer b : beers){
            if (b.getName().equals(param)){
                System.out.println(b.toString());
            }
        }
    }

    private void listByParam(ArrayList<Beer> beers,String keyword,String param){
        for(Beer b : beers){
            switch (keyword){
                case "name":
                    if (b.getName().equals(param)) System.out.println(b.toString());
                    break;
                case "style":
                    if (b.getStyle().equals(param)) System.out.println(b.toString());
                    break;
                case "strength":
                    if (String.valueOf(b.getStrength()).equals(param)) System.out.println(b.toString());
                    break;
            }
        }
    }
}
