import java.util.*;

// Abstract class representing a book
abstract class Book {
    String title;
    String author;
    
    // Constructor to set the title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Abstract method to be implemented by subclasses
    abstract void display();
}

// Subclass of Book, representing a specific type of book
class MyBook extends Book {
    int price;

    // Constructor to set title, author, and price
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    // Implementation of the display method for MyBook
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values for title, author, and price
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        
        // Create a new MyBook object and call the display method
        Book book = new MyBook(title, author, price);
        book.display();
    }
}

