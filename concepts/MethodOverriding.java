// Method Overriding: A feature that allows a subclass to provide a different implementation of a method already defined in its superclass.

// Class representing a Shape
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Class representing a Circle, subclass of Shape
public class Circle extends Shape {
    // Overriding the draw() method from the Shape class
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

// Class representing a Rectangle, subclass of Shape
public class Rectangle extends Shape {
    // Overriding the draw() method from the Shape class
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

// Creating objects of the Circle and Rectangle classes
Shape circle = new Circle();
Shape rectangle = new Rectangle();

// Calling the draw() method on the circle object, which invokes the overridden method in the Circle class
circle.draw();

// Calling the draw() method on the rectangle object, which invokes the overridden method in the Rectangle class
rectangle.draw();
