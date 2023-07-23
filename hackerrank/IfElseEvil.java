import java.io.*;
import java.util.*;




public class IfElseEvil {
    
    public static boolean isOdd(int N) {
        return N % 2 != 0;
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int N;
    
        do {
            System.out.print("Enter an integer between 1 and 100: ");
    
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer between 1 and 100: ");
                scanner.next(); // Discard the non-integer input
            }
    
            N = scanner.nextInt();
    
            if (N < 1 || N > 100) {
                System.out.println("Number is out of range. Try again.");
            }
            } while (N < 1 || N > 100);
    
        scanner.close();
        return N;
    }

    public static void main(String[] args) throws IOException {
        
        int N = getInput();

        if (isOdd(N)) {
            System.out.println("Weird");
        }
        else if (!isOdd(N) && 1 < N && N < 6) {
            System.out.println("Not Weird");
        }
        else if (!isOdd(N) && 5 < N && N < 21) {
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }

    }

}
