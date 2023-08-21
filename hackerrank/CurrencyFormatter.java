import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        Locale INDIA = new Locale("en", "id");

        String u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String wtf = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        String i = wtf.replace("IDR", "Rs.");

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);

        scanner.close();
    }
}