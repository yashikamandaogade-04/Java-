abstract class Shape {
    abstract double calculate_area();
    void display_info() { System.out.println("This is a shape."); }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double calculate_area() { return Math.PI * r * r; }
}

class Rect extends Shape {
    double l,b;
    Rect(double l,double b){this.l=l;this.b=b;}
    double calculate_area(){return l*b;}
}

public class TestShape {
    public static void main(String[] args) {
        // Shape s = new Shape(); // ERROR: cannot instantiate
        Shape c = new Circle(5);
        Shape r = new Rect(4,6);
        c.display_info(); System.out.println("Circle area: " + c.calculate_area());
        r.display_info(); System.out.println("Rect area: " + r.calculate_area());
    }
}
