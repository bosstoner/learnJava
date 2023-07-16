// Abstract Class: A class that cannot be instantiated and may contain both abstract and non-abstract methods.

// Abstract class representing a shape
public abstract class Shape {
    // Abstract method for calculating the area
    public abstract double calculateArea();
    
    // Non-abstract method for printing the shape
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending the Shape abstract class
public class Circle extends Shape {
    private double radius;
    
    // Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing the calculateArea() method from the Shape abstract class
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Using the Shape abstract class and Circle class
public class Main {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);
        
        // Calculating and printing the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
        
        // Calling the non-abstract method from the Shape abstract class
        circle.printShape();
    }
}
