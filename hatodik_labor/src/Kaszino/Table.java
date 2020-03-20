package Kaszino;


import java.sql.SQLOutput;
import java.util.Random;

public class Table {
    private Player [] players;
    private double pot;
    private int round;
    private double goal;
    Random r = new Random();

    public Table() {
        this.players = new Player[10];
        this.pot = 0;
        this.round = 1;
        this.goal = r.nextDouble();
    }

    public void newGame(){
        this.pot = 0;
        this.round = 0;
        this.pot =  r.nextDouble();
    }

    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null){
                players[i] = player;
                players[i].setTable(this);
                return;
            }
        }
    }

    public void raise(double d){
        this.pot += d;
    }

    public void round() {
        System.out.println("---------------------------------");
        System.out.println("A jelenlegi tét : " + pot);
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                round += 1;
                return;
            }
            players[i].lep();
        }
        round += 1;
        System.out.println("---------------------------------");
    }

    public int getRound() {
        return round;
    }

    public double getPot() {
        return pot;
    }
}
