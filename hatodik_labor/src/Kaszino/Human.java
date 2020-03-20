package Kaszino;

import java.util.Scanner;

public class Human extends Player {
    public Human() {
        super();
    }

    @Override
    public void lep() {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.table.getPot());
        System.out.println("Mennyivel emeljen?");
        this.table.raise(sc.nextDouble());
    }
}
