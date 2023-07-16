// Abstraction: The process of simplifying complex systems by breaking them into smaller, more manageable modules.
// It focuses on essential features and hides unnecessary details.

// Abstract class representing a Shape
public abstract class Shape {
    // Abstract method for calculating the area
    public abstract double calculateArea();
}

// Concrete class representing a Rectangle, extending the Shape class
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor for Rectangle class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing the calculateArea() method from the Shape class
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Creating an object of the Rectangle class
Shape rectangle = new Rectangle(5.0, 3.0);

// Calling the calculateArea() method on the rectangle object
double area = rectangle.calculateArea();

System.out.println("Area of the rectangle: " + area);
