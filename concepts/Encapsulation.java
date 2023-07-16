// Encapsulation: The process of hiding internal details and providing a public interface to interact with the object.
// It helps in maintaining data integrity and security.

// Car class with encapsulation
public class Car {
    private String color; // private access modifier to encapsulate the color property
    private int year; // private access modifier to encapsulate the year property
    
    // Setter method to set the value of the color property
    public void setColor(String color) {
        this.color = color;
    }
    
    // Getter method to retrieve the value of the color property
    public String getColor() {
        return color;
    }
    
    // start() method represents a behavior of the Car class
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Creating an object of the Car class
Car myCar = new Car();

// Using the setter method to set the color of the car object
myCar.setColor("Red");

// Using the getter method to retrieve the color of the car object
System.out.println("Car color: " + myCar.getColor());

// Calling the start() method on the car object
myCar.start();
