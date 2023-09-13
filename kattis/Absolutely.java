import java.util.Scanner;

public class Absolutely {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLi();
        long y = sc.nextLong();
        sc.close();

        long diff = x - y;
        long total = Math.abs(diff);

        System.out.println(total);
    }
}