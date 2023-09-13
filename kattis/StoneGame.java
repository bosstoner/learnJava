import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Check if the number of stones is odd or even
        if (n == 4) {
            System.out.println("Alice");
        }
        else if (n % 2 == 1) {
            System.out.println("Alice");
        }
        else {
            System.out.println("Bob");
        }
        
        scanner.close();
    }
}