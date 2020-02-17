public class PrimitvParaméterek {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        ki2(a,b);
        elo2(a,b);
        ki2(a,b);
    }
    public static void ki2(int a, int b) {
        System.out.println(a + "||" + b);
    }

    public static void elo2(int a, int b) {
        a *= -1;
        b *= -1;
        ki2(a,b);
    }

}
