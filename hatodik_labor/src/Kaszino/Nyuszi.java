package Kaszino;

public class Nyuszi extends Player {
    private String color;

    public Nyuszi(String color) {
        this.color = color;
    }

    @Override
    public void lep() {
        Table table = this.table;
        System.out.println(toString());
        System.out.println(table.getRound());
        if (table.getPot() < 50){
            table.raise(5);
        } else {
            System.out.println("Hűha");
        }
    }

    @Override
    public String toString() {
        return color + " színű nyuszi";
    }
}
