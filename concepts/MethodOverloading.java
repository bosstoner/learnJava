// Method Overloading: A feature that allows multiple methods in a class to have the same name but different parameters.

// Class representing a Calculator
public class Calculator {
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

// Creating an object of the Calculator class
Calculator calculator = new Calculator();

// Calling the add() method with two integers, which invokes the first overloaded method
int result1 = calculator.add(5, 10);

// Calling the add() method with three integers, which invokes the second overloaded method
int result2 = calculator.add(5, 10, 15);

// Calling the add() method with two doubles, which invokes the third overloaded method
double result3 = calculator.add(2.5, 3.5);
