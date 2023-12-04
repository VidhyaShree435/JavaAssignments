package Assignment12;

abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass implementing the abstract class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass implementing the abstract class
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractionMain {
    public static void main(String[] args) {
        // Create instances of concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Use the abstract class reference to call concrete methods
        circle.display();
        rectangle.display();

        // Use the abstract class reference to call the abstract method
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}