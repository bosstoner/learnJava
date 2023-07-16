// Constructor: A special method that is used to initialize objects of a class. It has the same name as the class.

// Class representing a Person
public class Person {
    private String name;
    private int age;
    
    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods for name and age
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

// Creating an object of the Person class using the constructor
Person person = new Person("John Doe", 30);

// Accessing the object's properties using getter methods
String name = person.getName();
int age = person.getAge();
