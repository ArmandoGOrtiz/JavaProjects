// Armando Ortiz
// 9-29-2019
// Project 2b
import java.util.Scanner;
public class Test3 {
    // Input date to see day of week
    public static void main(String[] args) {
        // creates scanner
        Scanner s = new Scanner(System.in);
        String userName;
        // variable to repeat loop
        int again = 1;
        while (again != 0) {
            // enter month
            System.out.print("Enter your month from numbers 0 to 11: ");
            String month = s.nextLine();
            int x = Integer.parseInt(month);
            // enter day
            System.out.print("Enter your day from 1 to 31: ");
            String day = s.nextLine();
            int y = Integer.parseInt(day);
            // enter year
            System.out.print("Enter your year: ");
            String year = s.nextLine();
            int z = Integer.parseInt(year);

            // set dayOfWeek to inputs of the typed in dates then prints
            System.out.println(Calendars.dayOfWeek(x,y,z));

            System.out.print("Do you want to enter another date? Enter 1 for yes, 0 for no: ");
            userName = s.nextLine();
            // ask if you want to continue entering dates 1 repeats the loop 0 ends it
            if (Integer.parseInt(userName) == 1) {

            }
            else {
                System.out.println("Goodbye");
                again = 0;
                s.close();}
            }
    }
}
