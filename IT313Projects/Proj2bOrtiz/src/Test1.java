// Armando Ortiz
// 9-29-2019
// Project 2b

public class Test1 {
    public static void main(String[] args) {
       // have 5 different sets of variable to be manually input and tested
       int month = 11;
       int day = 14;
       int year = 1997;
       // Prints results
       String date = Calendars.dayOfWeek(month,day,year);
       System.out.println(date);
        int month2 = 6;
        int day2 = 2;
        int year2 = 1997;
        String date2 = Calendars.dayOfWeek(month2,day2,year2);
        System.out.println(date2);
        int month3 = 0;
        int day3 = 17;
        int year3 = 2019;
        String date3 = Calendars.dayOfWeek(month3,day3,year3);
        System.out.println(date3);
        int month4 = 0;
        int day4 = 1;
        int year4 = 2019;
        String date4 = Calendars.dayOfWeek(month4,day4,year4);
        System.out.println(date4);
        int month5 = 10;
        int day5 = 11;
        int year5= 1913;
        String date5 = Calendars.dayOfWeek(month5,day5,year5);
        System.out.println(date5);

    }
}
