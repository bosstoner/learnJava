import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        int[] values = scanNums();
        int a = values[0];
        int b = values[1];
        adder(a, b);
    }

    public static int[] scanNums() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int[] values = {a, b};
        return values;
    }

    public static void adder(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
