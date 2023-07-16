// Static Members: Members (variables and methods) that belong to the class itself, rather than individual objects.

// Class with static members
public class MyClass {
    // Static variable: Shared among all instances of the class
    public static int staticVariable;
    
    // Instance variable
    public int instanceVariable;
    
    // Static method: Can be called directly using the class name
    public static void staticMethod() {
        System.out.println("Static method called.");
    }
    
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called.");
    }
}

// Accessing static members
public class AnotherClass {
    public static void main(String[] args) {
        // Accessing static variables and methods using the class name
        MyClass.staticVariable = 10;
        MyClass.staticMethod();
        
        // Static members can also be accessed using an instance of the class
        MyClass obj = new MyClass();
        obj.staticVariable = 20;
        obj.staticMethod();
        
        // Accessing instance variables and methods requires an instance of the class
        obj.instanceVariable = 30;
        obj.instanceMethod();
    }
}
