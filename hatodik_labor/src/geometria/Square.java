package geometria;

public class Square extends Shape {
    private double d;
    private double perimeter;
    private double area;

    public Square(double d) {
        this.d = d;
        this.perimeter = 4 * d;
        this.area = d * d;
    }


    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimater() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square : d = " + d + ", perimeter = " + perimeter + ", area = " + area;
    }
}
