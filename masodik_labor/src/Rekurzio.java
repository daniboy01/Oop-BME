public class Rekurzio {
    public static void main(String[] args) {
        System.out.println(Faktorialis(17));
        long n = 9;
        System.out.println(fib(n));
        hanoi(4,'A','B','C');
    }
    public static long Faktorialis(long n) {
        if (n <= 1) {
            return 1;
        }
        if (n > Integer.MAX_VALUE) {
            return 0;
        }
        return n * Faktorialis(n-1);
    }

    public static long fib(long n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void hanoi(int n, char honnan, char hova, char segéd) {
        if(n == 1) {
            System.out.println("Átrakja a korongot " + honnan + " rúdról a " + hova + " rúdra");
            return;
        }
        hanoi(n-1,honnan,segéd,hova);
        System.out.println("Átrakja a " + n + " korongot" + honnan + " rúdról" + " a " + honnan + " rúdra.");
        hanoi(n-1,segéd,hova,honnan);
    }

}
