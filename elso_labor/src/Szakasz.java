import java.util.Scanner;

public class Szakasz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        szakaszHossza(sc);
    }
    public static void szakaszHossza(Scanner sc){
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double hossz = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println(hossz);
    }
}
