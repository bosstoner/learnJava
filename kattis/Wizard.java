import java.util.Scanner;

public class Wizard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int magicNr = sc.nextInt();
        sc.close();

        int i;
        for (i = 1; i <= magicNr; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}