import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while (q-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = a;
            for (int i = 0; i < n; i++) {
                sum += (int) (Math.pow(2, i) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
