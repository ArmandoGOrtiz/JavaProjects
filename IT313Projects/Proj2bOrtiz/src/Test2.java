// Armando Ortiz
// 9-29-2019
// Project 2b
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test2 {
    // all instance variables required for unit test
    private int month;
    private int day;
    private int year;
    private int month2;
    private int day2;
    private int year2;
    private int month3;
    private int day3;
    private int year3;
    private int month4;
    private int day4;
    private int year4;
    private int month5;
    private int day5;
    private int year5;

    @BeforeEach
    public void setUp() {
        // My birthday
        month = 11;
        day = 14;
        year = 1997;
    }

    @Test
    public void dayOfWeek() {
        assertEquals("The day of the week is Sunday", Calendars.dayOfWeek(month, day, year));
    }

    @BeforeEach
    public void setUp2() {
        month2 = 6;
        day2 = 2;
        year2 = 1997;
    }

    @Test
    public void dayOfWeek2() {
        assertEquals("The day of the week is Wednesday", Calendars.dayOfWeek(month2, day2, year2));
    }

    @BeforeEach
    public void setUp3() {
        month3 = 0;
        day3 = 17;
        year3 = 2019;
    }

    @Test
    public void dayOfWeek3() {
        assertEquals("The day of the week is Thursday", Calendars.dayOfWeek(month3, day3, year3));
    }
    @BeforeEach
    public void setUp4() {
        month4 = 0;
        day4 = 1;
        year4 = 2019;
    }

    @Test
    public void dayOfWeek4() {
        assertEquals("The day of the week is Tuesday", Calendars.dayOfWeek(month4, day4, year4));
    }
    @BeforeEach
    public void setUp5() {
        month5 = 10;
        day5 = 11;
        year5 = 1913;
    }

    @Test
    public void dayOfWeek5() {
        assertEquals("The day of the week is Tuesday", Calendars.dayOfWeek(month5, day5, year5));
    }
}
