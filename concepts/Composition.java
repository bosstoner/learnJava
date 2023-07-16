// Composition: A way to combine objects or classes into more complex structures or systems.

// Class representing an Engine
public class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

// Class representing a Car, composed of an Engine
public class Car {
    private Engine engine; // Composition: Car has an Engine
    
    // Constructor for Car class
    public Car() {
        engine = new Engine(); // Creating an Engine object within the Car class
    }
    
    public void startCar() {
        engine.start(); // Delegating the start behavior to the Engine object
        System.out.println("Car started.");
    }
}

// Creating an object of the Car class
Car myCar = new Car();

// Starting the car
myCar.startCar();
