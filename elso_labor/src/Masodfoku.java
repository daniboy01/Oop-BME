import java.util.Scanner;

public class Masodfoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        masodfokuEgyenlet(sc);
    }

    public static void masodfokuEgyenlet(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double diszkrimináns = b*b - (4*a*c);
        if (diszkrimináns < 0) {
            System.out.println("Nincs megoldás!");
        }
        else if (diszkrimináns == 0) {
            diszkrimináns = Math.sqrt(b*b - (4*a*c));
            double gyok = (-b + diszkrimináns)/(2*a);
            System.out.println("Az egyenletnek egy valós gyöke van: "+gyok);
        } else {
            diszkrimináns = Math.sqrt(b*b - (4*a*c));
            double gyok1 = (-b - diszkrimináns)/(2*a);
            double gyok2 = (-b + diszkrimináns)/(2*a);
            System.out.println("Az egyenletnek két valós gyöke van: " + gyok1 + " és " + gyok2);
        }
    }
}
