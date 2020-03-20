package geometria;

public class Triangle extends Shape {
    private double a,b,c;
    private double area;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double s = (a + b + c )/2;
        this.area = Math.sqrt(s*(s-a) * (s-b) * (s-c));
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimater() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle : a = " + a + ", b =" + b + ", c = " + c + ", area = " + area;
    }
}
