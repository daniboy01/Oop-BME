package geometria;

import java.util.ArrayList;

public class Compound extends Shape {
    private ArrayList<Shape> shapes;

    public Compound() {
        this.shapes = new ArrayList<>();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public Shape getShapeByIndex (int i ) throws IndexOutOfBoundsException {
        return shapes.get(i);
    }

    public int getSize(){
        return shapes.size();
    }

    @Override
    public String toString() {
        String shapes = "";
        for(Shape s : this.shapes) {
            shapes += s.toString() + " ";
        }
        return shapes;
    }

    @Override
    public double getArea() {
        double area = 0;
        for (Shape s : shapes) {
            area += s.getArea();
        }
        return area;
    }

    @Override
    public double getPerimater() {
        double perimeter = 0;
        for (Shape s : shapes) {
            perimeter += s.getPerimater();
        }
        return perimeter;
    }
}
