package Kaszino;

public class Mester extends Player {
    private int level;

    public Mester(int level) {
        this.level = level;
    }

    @Override
    public void lep() {
        System.out.println(toString());
        System.out.println(this.table.getRound()+ "-ik kör");

        double pot = this.table.getPot() * (level/100);

        this.table.raise(pot);
    }

    @Override
    public String toString() {
        return level + " szintű mester";
    }
}
