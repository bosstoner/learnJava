import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of entries in the phone book
        Map<String, Integer> phoneBook = new HashMap<>(); // Create a map to store phone book entries
        
        // Read phone book entries and populate the map
        for (int i = 0; i < n; i++) {
            String name = in.next(); // Read friend's name
            int phone = in.nextInt(); // Read friend's phone number
            phoneBook.put(name, phone); // Store the name and phone number in the map
        }
        
        // Read queries and lookup phone numbers
        while (in.hasNext()) {
            String query = in.next(); // Read the query name
            if (phoneBook.containsKey(query)) { // Check if the name exists in the map
                int phoneNumber = phoneBook.get(query); // Get the phone number for the name
                System.out.println(query + "=" + phoneNumber); // Print the result
            } else {
                System.out.println("Not found"); // Print "Not found" if name is not in the map
            }
        }
        
        in.close(); // Close the scanner
    }
}

