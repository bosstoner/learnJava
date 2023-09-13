import java.util.Scanner;

public class Backspace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.next();
        char charToRemove = '<';
        scan.close();

        StringBuilder sb = new StringBuilder(original);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == charToRemove) {
                sb.deleteCharAt(i);
                i--; // Adjust the index after deletion
                sb.deleteCharAt(i);
                i--;
            }
        }

        String modified = sb.toString();
        System.out.println(modified); // Output: Hell, Wrld!
    }
}
