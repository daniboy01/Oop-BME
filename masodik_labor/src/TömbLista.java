import java.util.Scanner;

public class TömbLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbs = new int[10];
        for (int i = 0; i < 10; i++) {
            numbs[i] = sc.nextInt();
        }
        tombKi(numbs);
        System.out.println();
        tomPoz(numbs);
        System.out.println();
        tombKi(numbs);
    }
    public static void tombKi(int[] numbs) {
        for (int x : numbs) {
            System.out.print(x + " ");
        }
    }
    public static void tomPoz(int[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] *= -1;
        }
        tombKi(numbs);
    }
}
