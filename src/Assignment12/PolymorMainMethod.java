package Assignment12;

class Shape1 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circles extends Shape1 {
    // Method overriding
    @Override
    void draw() {
        System.out.println("Drawing a circles");
    }
}

// Subclass 2
class Square extends Shape1 {
    // Method overriding
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Subclass 3
class Triangle extends Shape1 {
    // Method overriding
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class
public class PolymorMainMethod {
    public static void main(String[] args) {
        // Creating instances of different subclasses
        Shape1 circle = new Circles();
        Shape1 square = new Square();
        Shape1 triangle = new Triangle();

        // Calling the draw method on each object
        circle.draw();   // Calls the draw method of Circle class
        square.draw();   // Calls the draw method of Square class
        triangle.draw(); // Calls the draw method of Triangle class
    }
}