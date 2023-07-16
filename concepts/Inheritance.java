// Inheritance: Allows one class to inherit the properties and methods of another class, forming a parent-child relationship.
// The child class can access the members of the parent class.

// Vehicle class (parent class)
public class Vehicle {
    protected String brand; // protected access modifier allows access to subclasses
    
    // honk() method represents a behavior of the Vehicle class
    public void honk() {
        System.out.println("Honk honk!");
    }
}

// Car class (child class) inheriting from Vehicle class
public class Car extends Vehicle {
    private int year; // additional property specific to the Car class
    
    // Constructor for Car class
    public Car(String brand, int year) {
        this.brand = brand; // accessing the protected member from the parent class
        this.year = year;
    }
    
    // start() method represents a behavior of the Car class
    public void start() {
        System.out.println("The car is starting.");
    }
}

// Creating an object of the Car class
Car myCar = new Car("Toyota", 2021);

// Calling the start() method on the car object
myCar.start();

// Calling the honk() method inherited from the Vehicle class
myCar.honk();

// Accessing the brand property inherited from the Vehicle class
System.out.println("Car brand: " + myCar.brand);
