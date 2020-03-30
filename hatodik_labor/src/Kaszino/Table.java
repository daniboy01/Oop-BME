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
        this.goal =  1 + (100 - 1) * r.nextDouble();
    }

    public void newGame(){
        this.pot = 0;
        this.round = 0;
        this.pot =  1 + (100 - 1) * r.nextDouble();
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
        System.out.println("A játék célja : " + goal);
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                round += 1;
                return;
            }
            players[i].lep();
            if (this.pot > this.goal){
                System.out.println("vége a játéknak!");
                break;
            }
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
