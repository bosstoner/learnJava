
import java.util.*;
import java.util.Calendar;

class WhatDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        int day = scanner.nextInt();

        int year = scanner.nextInt();

        String result = WhatDay.findDay(month, day, year).toUpperCase();

        System.out.println(result);

        scanner.close();
    }

    public static String findDay(int month, int day, int year) {
        
        // Create a Calendar instance and set it to the desired date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day-1); // Month needs to be adjusted by -1 as Calendar uses 0-based months.

        // Get the day of the week as an integer (Sunday = 1, Monday = 2, ..., Saturday = 7)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String daay;
        switch(dayOfWeek) {
            case 1:
            daay = "Monday";
            break;
            case 2:
            daay = "Tuesday";
            break;
            case 3:
            daay = "Wednesday";
            break;
            case 4:
            daay = "Thursday";
            break;
            case 5:
            daay = "Friday";
            break;
            case 6:
            daay = "Saturday";
            break;
            case 7:
            daay = "Sunday";
            break;
            default:
            return "oep";
        }

        return daay;
    }
}
