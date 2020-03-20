package geometria;

public class Circle extends Shape {
    private double r;
    private double perimeter;
    private double area;

    public Circle(double r) {
        this.r = r;
        this.perimeter = 2 * r * Math.PI;
        this.area = (r*r) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle r = " + r + ", perimeter = " + perimeter + ", area = " + area;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimater() {
        return perimeter;
    }
}
