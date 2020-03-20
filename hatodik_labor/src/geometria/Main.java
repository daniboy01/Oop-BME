package geometria;

public class Main {
    public static void main(String[] args) {
        Compound comp = new Compound();
        Compound c1 = new Compound();
        Compound c2 = new Compound();

        c1.add(new Circle(2));
        c1.add(new Circle(3));

        c2.add(new Square(2));
        c2.add(new Square(3));

        comp.add(c1);
        comp.add(c2);

        for (Shape s : comp.getShapes()) {
            System.out.println(s.toString());
        }

        System.out.println("Területe: " + comp.getArea());
        System.out.println("Kerülete: " + comp.getPerimater());

        System.out.println(comp.toString());
    }
}
