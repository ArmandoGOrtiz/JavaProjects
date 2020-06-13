// Armando Ortiz
// 9-29-2019
// Project 2b

import java.util.Calendar;
public class Calendars {
    // Main method
    public static void main(String[] args) {
        // My birth date
        System.out.print(dayOfWeek(11,14, 1997));
    }
    // day of week method
    public static String dayOfWeek(int month, int day, int year){
        // Calendar object constructor
        Calendar cal = Calendar.getInstance();
        // Day names array
        String[ ] dayNames = {"", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};
        // set date to inputs
        cal.set(year, month, day);
        int code = cal.get(Calendar.DAY_OF_WEEK);
        // returns day of the week from the array
        return "The day of the week is " + dayNames[code];
    }
}