// Polymorphism: Allows objects of different classes to be treated as objects of a common superclass.
// It enables methods to be overridden in subclasses, providing different implementations.

// Vehicle class (parent class)
public class Vehicle {
    // honk() method represents a behavior of the Vehicle class
    public void honk() {
        System.out.println("Honk honk!");
    }
}

// Car class (child class) inheriting from Vehicle class
public class Car extends Vehicle {
    // Overriding the honk() method from the Vehicle class
    @Override
    public void honk() {
        System.out.println("Car honking: Beep beep!");
    }
}

// Motorcycle class (child class) inheriting from Vehicle class
public class Motorcycle extends Vehicle {
    // Overriding the honk() method from the Vehicle class
    @Override
    public void honk() {
        System.out.println("Motorcycle honking: Vroom vroom!");
    }
}

// Polymorphism example
Vehicle myVehicle = new Car();
myVehicle.honk(); // Calls the overridden honk() method in the Car class

myVehicle = new Motorcycle();
myVehicle.honk(); // Calls the overridden honk() method in the Motorcycle class
