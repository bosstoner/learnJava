import java.util.Scanner;

public class IfElStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = askQuestion("Enter your name: ", scanner);

        if (!username.equals(""))
            System.out.println("Hello " + username + "!");
        else {
            username = askQuestion("What is your name? ", scanner);
            System.out.println("Hello " + username + ". Welcome!");
        }
        scanner.close();
    }

    public static String askQuestion(String prompt, Scanner scanner) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }
}
