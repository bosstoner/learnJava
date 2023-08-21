import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            String s = scanner.next(); // Read the input string
            
            // Call the method to print even and odd characters
            printEvenOddCharacters(s);
        }
        
        scanner.close();
    }
    
    // Method to print even-indexed and odd-indexed characters of a string
    public static void printEvenOddCharacters(String s) {
        // Create StringBuilder objects to efficiently manipulate strings
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        
        // Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            // Check if the index is even or odd
            if (i % 2 == 0) {
                // Append even-indexed characters to evenChars
                evenChars.append(s.charAt(i));
            } else {
                // Append odd-indexed characters to oddChars
                oddChars.append(s.charAt(i));
            }
        }
        
        // Print even and odd characters with a space in between
        System.out.println(evenChars.toString() + " " + oddChars.toString());
    }
}

