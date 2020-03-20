package Kaszino;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Player p1 = new Mester(10);
        Player p2 = new Beginner("Pór Nóra");
        Player p3 = new Robot();
        Player p4 = new Nyuszi("piros");
        table.addPlayer(p1);
        table.addPlayer(p2);
        table.addPlayer(p3);
        table.addPlayer(p4);

        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
        table.round();
    }
}
