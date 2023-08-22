import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

// Create a class named 'Result' for the factorial calculation method
class Result {

    // Define a recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, factorial is 1
        if (n < 2) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            // Recur with a smaller problem (n-1) and multiply by n
            return n * factorial(n-1);
        }
    }
}

// Create the main class 'Solution' to interact with I/O
public class Solution {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader to read input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Initialize BufferedWriter to write output
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read an integer input, which is the argument for factorial
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Calculate factorial using the recursive method from the 'Result' class
        int result = Result.factorial(n);

        // Write the calculated result to the output
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        // Close the input and output streams
        bufferedReader.close();
        bufferedWriter.close();
    }
}

