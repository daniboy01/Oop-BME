package Kaszino;

public class Beginner extends Player {
    private String name;

    public Beginner(String name) {
        super();
        this.name = name;
    }

    @Override
    public void lep() {
        toString();
        System.out.println(this.table.getRound());
        if (this.table.getRound() % 2 != 0){
            System.out.println("Check");
        } else {
            this.table.raise(1.0);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
