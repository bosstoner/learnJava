import java.util.*;

public class ConvertToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = Integer.toString(n);

        if (s instanceof String) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
        scanner.close();
    }
}