import java.util.*;

// Define the Calculator class
class Calculator {
    public int power(int n, int p) throws Exception {
        // Check if either n or p is negative
        if (n < 0 || p < 0) {
            // If negative, throw an exception with the specified message
            throw new Exception("n and p should be non-negative");
        }
        // Calculate and return n^p
        return (int) Math.pow(n, p);
    }
}

// Main class
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Read the number of test cases
        while (t-- > 0) { // Loop through each test case
            int n = in.nextInt(); // Read n
            int p = in.nextInt(); // Read p
            
            // Create a Calculator object
            Calculator myCalculator = new Calculator();
            
            try {
                // Calculate the result of n^p using the power method
                int ans = myCalculator.power(n, p);
                
                // Print the calculated result
                System.out.println(ans);
            } catch (Exception e) {
                // If an exception occurs, print the error message
                System.out.println(e.getMessage());
            }
        }
        in.close(); // Close the scanner
    }
}

