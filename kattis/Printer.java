import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int statues = io.nextInt();
        int printers = 1;
        int statuesprinted = 0;
        int days = 0;

        io.close();

        while(statuesprinted < statues){
            if((statues-statuesprinted) > printers){
                days += 1;
                printers += printers;
            }
            else {
                days += 1;
                statuesprinted += printers;
            }
        }
        
        System.out.println(days);
    }
}