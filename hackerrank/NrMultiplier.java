import java.util.*;

public class NrMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i;

        scanner.close();

        for(i = 1; i < 11; i++) {
            int ered = number * i;
            System.out.println(number + " x " + i + " = " + ered);
        }        
    }
}
