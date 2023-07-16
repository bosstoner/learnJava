// Classes: Blueprints or templates that define the structure and behavior of objects.
// For example, a Car class defines the properties and methods that a car object can have.

// Objects: Instances of classes that encapsulate data and behavior.
// For example, a Car object represents a specific car with its unique characteristics and actions.

// Car class
public class Car {
    String color;
    int year;
    
    // start() method represents a behavior of the Car object
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Creating an object of the Car class
Car myCar = new Car();
myCar.color = "Red"; // Assigning a specific color to the car object
myCar.year = 2021;  // Assigning a specific year to the car object
myCar.start();  // Calling the start() method on the car object
