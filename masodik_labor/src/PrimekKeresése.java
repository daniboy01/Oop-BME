public class PrimekKeresése {
    public static void main(String[] args) {
        int actual = 2;
        int primeNumber = 0;
        while (primeNumber < 100){
            if (prim_e(actual)){
                primeNumber++;
                System.out.println(primeNumber +". "+ actual);
            }
            actual++;
        }
    }
    public static int osztokSzama(int x) {
        int counter = 0;
        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static boolean prim_e(int x) {
        if (osztokSzama(x) == 2) {
            return true;
        }
        return false;
    }
}