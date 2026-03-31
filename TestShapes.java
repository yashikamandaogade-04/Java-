class Shape {
    void display() {
        System.out.println("This is a general shape.");
    }
}

class Circle extends Shape {
    double r;
    Circle(double r){this.r=r;}
    void area(){System.out.println("Circle area: "+Math.PI*r*r);}
}

class Rectangle extends Shape {
    double l,b;
    Rectangle(double l,double b){this.l=l;this.b=b;}
    void area(){System.out.println("Rectangle area: "+l*b);}
}

public class TestShapes {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4,6);
        c.display(); c.area();
        r.display(); r.area();
    }
}
