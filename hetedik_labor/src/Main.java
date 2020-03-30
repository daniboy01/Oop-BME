import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static ArrayList<Beer> beers;
    private static HashMap<String, Command> commands;

    public static void main(String[] args) {
        commands = new HashMap<>();
        beers  = new ArrayList<>();
        beers.add(new Beer("Soproni","lager",4.5));
        beers.add(new Beer("Heineken","ale",5.0));
        beers.add(new Beer("Guiness","stout",5.5));
        beers.add(new Beer("Aranyászok","ipa",7.0));
        setupCommand();
        application();
    }

    public static void setupCommand(){
        Command add = new Add("add");
        Command list = new List("list");
        Command search = new Search("search");
        Command find = new Find("find");
        Command delete = new Delete("delete");
        commands.put("add",add);
        commands.put("list",list);
        commands.put("search",search);
        commands.put("find",find);
        commands.put("delete",delete);
    }

    public static void application(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Bemeneti sor:");
            String line = sc.nextLine();
            String [] cmd = line.split(" ");

            if (cmd[0].equals("exit")) {
                break;
            } else if (cmd[0].equals("add")){
                commands.get("add").action(beers,cmd);
            } else if (cmd[0].equals("list")){
                commands.get("list").action(beers,cmd);
            } else if(cmd[0].equals("search")){
                commands.get("search").action(beers,cmd);
            } else if(cmd[0].equals("find")){
                commands.get("find").action(beers,cmd);
            } else if(cmd[0].equals("delete")){
                commands.get("delete").action(beers,cmd);
            }
        }
    }

    //szorgalmi feladat kiváltja
    protected static void add(String[] cmd ){
        beers.add(new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3])));
    }

    //szorgalmi feladat kiváltja
    protected static void list(String[] cmd){
        for(Beer b : beers){
            System.out.println(b.toString());
        }
    }
}
