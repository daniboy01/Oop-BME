package Kaszino;

public abstract class Player {
    protected Table table;

    public Player() {}

    public void lep(){
        System.out.println(table.getRound() + ". körben játrunk");
        System.out.println("Jelenlegi tét " + table.getPot());
        System.out.println("Játékos emel!");
        table.raise(1.0);
    }


    public void setTable(Table table) {
        this.table = table;
    }
}
