import java.util.Scanner;

public class Faktoriális {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(faktoriális(sc));
        System.out.println(faktorialis(sc));

    }
    public static int faktoriális(Scanner sc) {
        int szam = sc.nextInt();
        int eredmény = 1;
        for (int i = 1; i <= szam; i++) {
            eredmény = eredmény * i;
        }
        return eredmény;
    }
    public static int faktorialis(Scanner sc){
        int szam = sc.nextInt();
        int eredmeny = 1;
        int i = 1;
        while (i <= szam) {
            eredmeny = eredmeny * i;
            i++;
        }
        return eredmeny;
    }
}
