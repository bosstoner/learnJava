import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the input integer
        
        // Convert the integer to its binary representation as a string
        String binaryRepresentation = toBinary(n);
        // Find the maximum number of consecutive ones in the binary representation
        int maxConsecutiveOnes = findMaxConsecutiveOnes(binaryRepresentation);
        
        // Print the result
        System.out.println(maxConsecutiveOnes);
        scanner.close();
    }
    
    // Method to convert an integer to binary representation as a string
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
    
    // Method to find the maximum number of consecutive ones in a binary string
    public static int findMaxConsecutiveOnes(String binary) {
        int maxConsecutive = 0; // Initialize the maximum consecutive count
        int currentConsecutive = 0; // Initialize the current consecutive count
        
        // Loop through the binary string
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                // If the current digit is '1', increment the current consecutive count
                currentConsecutive++;
                // Update the maximum consecutive count if necessary
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else {
                // If the current digit is '0', reset the current consecutive count
                currentConsecutive = 0;
            }
        }
        
        // Return the maximum consecutive count
        return maxConsecutive;
    }
}

