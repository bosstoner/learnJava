import java.util.Scanner;

public class ReadWhiteSpaceF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Print the line of equal signs before the formatted output
        System.out.println("================================");

        // Process each line of input
        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();
            
            // Format and print the output using printf
            System.out.printf("%-15s%03d%n", str, num);
        }
        
        // Print the line of equal signs after the formatted output
        System.out.println("================================");

        // Close the scanner
        scanner.close();
    }
}
