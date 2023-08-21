import java.util.*;

public class ParaArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (b < 1 || h < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            area(b, h);
        }
        scanner.close();
    }

    public static void area(int b, int h) {
        int area = b * h;
        System.out.println(area);
    }
}