class Shape {
    double dim1, dim2;
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double findArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }
    public double findArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }
    public double findArea() {
        return 0.5 * dim1 * dim2;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0); // Use 0 for dim2 since it's not needed
    }
    public double findArea() {
        return Math.PI * dim1 * dim1;
    }
}

public class ShhapeDemo{
    public static void main(String args[]){
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 4);
        Circle c = new Circle(7);

        System.out.println("Rectangle Area: " + r.findArea());
        System.out.println("Triangle Area: " + t.findArea());
        System.out.println("Circle Area: " + c.findArea());
    }
}
