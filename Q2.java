// Superclass Shape
abstract class Shape {
    abstract double calculateArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
}

// ShapeCalculator class
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 8);
        
        shapeCalculator.printArea(rectangle);  // The area of the shape is: 15.0
        shapeCalculator.printArea(circle);     // The area of the shape is: 50.26544
        shapeCalculator.printArea(triangle);   // The area of the shape is: 24.0
    }
}
