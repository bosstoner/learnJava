import java.util.*;

public class EOFReader {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int count = 1;
        do {
            String oint = scanner.nextLine();
            if (oint.isEmpty()) {
                break;
            }
            System.out.println(count + " " + oint);
            count++;
        } while(scanner.hasNext());

        scanner.close();
    }
}