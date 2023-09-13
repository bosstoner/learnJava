import java.util.Scanner;

public class Equation {

    // (x + y)/2 = z
    // x+y = 2z
    // y = 2z - x
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int z = sc.nextInt();
            sc.close();

            int y = 2 * z - x;
            System.out.println(y); 
    }
}