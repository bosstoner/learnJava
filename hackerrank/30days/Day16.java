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

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input string
        String S = bufferedReader.readLine();

        // Attempt to convert the input string to an integer
        try {
            int number = Integer.parseInt(S); // This line tries to parse the string as an integer
            System.out.println(number); // If successful, print the parsed integer
        } catch (NumberFormatException kiskutya) {
            // If an exception occurs (e.g., the input cannot be parsed as an integer),
            // catch the NumberFormatException and execute this block
            System.out.println("Bad String"); // Print "Bad String" to indicate an error
        }

        bufferedReader.close();
    }
}

