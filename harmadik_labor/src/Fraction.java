public class Fraction {
    private int num; //numerator
    private int den; //denominator
    //tört értéke num/den

    // paraméter nékül 0/1
    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    // p egész paraméter p/1
    public Fraction(int p) {
        this.num = p;
        this.den = 1;
    }

    // p és q egész paraméter p/q
    public Fraction(int p, int q) {
        this.num = p;
        this.den = q;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    //tört értéke double-ben
    public double doubleValue() {
        return this.num / this.den;
    }

    //új Tört-tel tér vissza ami az eredeti reciproka
    public Fraction reciprocal() {
        return new Fraction(this.den,this.num);
    }

    //két tört összeadása
    public void add(Fraction f) {
        this.num += f.num;
        this.den += f.den;
    }

    //két tört kivonáca
    public void sub(Fraction f) {
        this.num -= f.num;
        this.den -= f.den;
    }

    //két tört szorzása
    public void mult(Fraction f) {
        this.num *= f.num;
        this.den *= f.den;
    }

    //két tört osztása
    public void div(Fraction f) {
        Fraction rec = f.reciprocal();
        this.num *= rec.num;
        this.den *= rec.den;
    }

    public String toString() {
        return this.num + "/" + this.den;
    }

    //innen szorgalmi

    //legnagyobb közös osztó
    public static int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // tört egyszerűsítő
    public void simplify() {
        int gcd = gcd(this.num,this.den);
        this.num /= gcd;
        this.den /= gcd;
    }

    public boolean greaterThan(Fraction f) {
        return this.doubleValue() > f.doubleValue();
    }

    public boolean lessThan(Fraction f) {
        return this.doubleValue() < f.doubleValue();
    }

    public int compareTo(Fraction f) {
        if (this.lessThan(f)) {
            return -1;
        } else if (this.greaterThan(f)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(5,3);
        Fraction f3 = new Fraction(3,4);

        System.out.println(f1.compareTo(f2));
        System.out.println(f2.compareTo(f1));
        System.out.println(f1.compareTo(f3));
    }
}
