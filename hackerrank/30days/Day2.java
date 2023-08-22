import java.io.*;
import java.util.*;

// Define the Person class
public class Person {
    // 1. Class: The code defines a class named 'Person', encapsulating attributes and behaviors related to a person.
    private int age; // Declare a private instance variable 'age'

    // 2. Constructor: Initialize the object; validate 'initialAge' and set 'age' accordingly
    public Person(int initialAge) {
        // 3. Encapsulation: Control access to 'age', encapsulating data within the class
        if (initialAge < 0) {
            this.age = 0; // Set age to 0 if negative
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge; // Set age to provided initial age
        }
    }

    // Method to increase the age by 1
    public void yearPasses() {
        this.age = age + 1; // Increment the age by 1
    }

    // Method to determine and print the person's age category
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    // Main method to read input and create Person instances
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases
        
        // 4. Looping: Process multiple test cases using loops
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt(); // Read the age for the current test case
            
            // 5. Object Instantiation: Create new Person instance with the provided age
            Person p = new Person(age);
            
            // 6. Method Utilization: Determine and print the age category
            p.amIOld();
            
            for (int j = 0; j < 3; j++) {
                // 6. Method Utilization: Increase age by 1 three times
                p.yearPasses();
            }
            
            // 6. Method Utilization: Determine and print the age category again
            p.amIOld();
            
            // Print an empty line between test cases
            System.out.println();
        }
        sc.close(); // Close the scanner
    }
}
// 7. Summary: This code exemplifies OOP principles such as encapsulation, class definition,
// method abstraction, and object instantiation. The Person class serves as a blueprint for creating
// instances with associated data and behaviors, promoting modular and maintainable code.

