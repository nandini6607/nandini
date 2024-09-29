// Abstract class Shape
abstract class Shape {
    // Two integers for dimensions (length, width, or radius, etc.)
    protected int dim1;
    protected int dim2;

    // Constructor to initialize dimensions
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to print the area
    public abstract void printArea();
}

// Class Rectangle that extends Shape
class Rectangle extends Shape {
    // Constructor for Rectangle
    public Rectangle(int length, int width) {
        super(length, width); // Call to parent constructor
    }

    // Overriding the printArea method to calculate the area of a rectangle
    @Override
    public void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}

// Class Triangle that extends Shape
class Triangle extends Shape {
    // Constructor for Triangle
    public Triangle(int base, int height) {
        super(base, height); // Call to parent constructor
    }

    // Overriding the printArea method to calculate the area of a triangle
    @Override
    public void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}

// Class Circle that extends Shape
class Circle extends Shape {
    // Constructor for Circle (only dim1 is used as the radius)
    public Circle(int radius) {
        super(radius, 0); // Only one dimension is needed for a circle
    }

    // Overriding the printArea method to calculate the area of a circle
    @Override
    public void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating objects for Rectangle, Triangle, and Circle
        Shape rectangle = new Rectangle(10, 20);
        Shape triangle = new Triangle(10, 15);
        Shape circle = new Circle(7);

        // Print the area of each shape
        rectangle.printArea();  // Rectangle area: length * width
        triangle.printArea();   // Triangle area: 0.5 * base * height
        circle.printArea();     // Circle area: π * radius^2
    }
}

