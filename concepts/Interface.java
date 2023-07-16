// Interface: A collection of abstract methods and constants. It defines a contract that implementing classes must adhere to.

// Interface defining a shape
public interface Shape {
    // Abstract method for calculating the area
    double calculateArea();
    
    // Abstract method for calculating the perimeter
    double calculatePerimeter();
    
    // Constant for PI
    double PI = 3.14159;
}

// Class implementing the Shape interface
public class Circle implements Shape {
    private double radius;
    
    // Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing the calculateArea() method from the Shape interface
    @Override
    public double calculateArea() {
        return Shape.PI * radius * radius;
    }
    
    // Implementing the calculatePerimeter() method from the Shape interface
    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * radius;
    }
}

// Using the Shape interface and Circle class
public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);
        
        // Calculating and printing the area and perimeter of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
    }
}
