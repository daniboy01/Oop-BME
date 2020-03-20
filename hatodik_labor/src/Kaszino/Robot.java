package Kaszino;

public class Robot extends Player {
    public Robot() {
        super();
    }

    @Override
    public void lep() {
        toString();
        System.out.println( "Robot "+this.table.getRound());
    }

    @Override
    public String toString() {
        return "Robot";
    }
}
