import java.util.Scanner;

public class TypeRecognizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // number of test cases
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String numberStr = scanner.nextLine();

            try {
                long num = Long.parseLong(numberStr);
                // Check if the number can be fitted into each data type
                System.out.println(num + " can be fitted in:");
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(numberStr + " can't be fitted anywhere.");
                continue;
            }
        }
        scanner.close();
    }
}
