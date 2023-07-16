// Access Modifiers: Keywords that define the visibility and accessibility of classes, variables, and methods.

// Class with different access modifiers
public class MyClass {
    // Public access modifier: Accessible from anywhere
    public int publicVariable;
    
    // Private access modifier: Accessible only within the same class
    private int privateVariable;
    
    // Default access modifier: Accessible within the same package
    int defaultVariable;
    
    // Protected access modifier: Accessible within the same package and subclasses
    protected int protectedVariable;
    
    // Public method: Accessible from anywhere
    public void publicMethod() {
        // Method implementation...
    }
    
    // Private method: Accessible only within the same class
    private void privateMethod() {
        // Method implementation...
    }
    
    // Default method: Accessible within the same package
    void defaultMethod() {
        // Method implementation...
    }
    
    // Protected method: Accessible within the same package and subclasses
    protected void protectedMethod() {
        // Method implementation...
    }
}

// Accessing variables and methods from another class
public class AnotherClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Accessing public variables and methods
        obj.publicVariable = 10;
        obj.publicMethod();
        
        // Cannot access private variables and methods
        // obj.privateVariable = 20; // Compilation error
        // obj.privateMethod(); // Compilation error
        
        // Accessing default variables and methods within the same package
        obj.defaultVariable = 30;
        obj.defaultMethod();
        
        // Accessing protected variables and methods within the same package or subclasses
        obj.protectedVariable = 40;
        obj.protectedMethod();
    }
}
