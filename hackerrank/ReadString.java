import java.util.*;

public class ReadString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your prompt: ");
        String userinput = scanner.nextLine();
        
        scanner.close();

        System.out.println("Hello, World. ");
        System.out.println(userinput);
    }
}