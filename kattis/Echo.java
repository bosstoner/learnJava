import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int wordNr = sc.nextInt();
            sc.nextLine();
            String[] wordArray = new String[wordNr];

            int i;
            for (i = 0; i < wordNr; i++) {
                wordArray[i] = sc.nextLine();
            }
            sc.close();

            for (i = 0; i < wordNr; i += 2) {
                System.out.println(wordArray[i]);
            }
    }
}