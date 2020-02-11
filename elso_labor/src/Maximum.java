import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println(legnagyobb(sc));
        System.out.println(legkisebb(sc));
        System.out.println(masodik_legnagyobb(sc));

    }
    public static int legnagyobb(Scanner sc) {
        int b = 0;
        while (true) {
            int a = sc.nextInt();
            if (a < 0) {
                return b;
            }
            if (a > b) {
                b = a;
            }
        }
    }

    public static int legkisebb(Scanner sc) {
        int b = sc.nextInt();
        while (true) {
            int a = sc.nextInt();
            if (a < 0) {
                return b;
            }
            if (a < b) {
                b = a;
            }
        }
    }

    public static int masodik_legnagyobb(Scanner sc) {
        int b = 0;
        int c = 0;
        while (true) {
            int a = sc.nextInt();
            if (a < 0) {
                return c;
            }
            if (a > b) {
                c = b;
                b = a;
            }
        }
    }
}
