package day14_week;

import homework.day14_week.DayOfWeekUtility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class TestngDayOfWeekUtilityTests {

    private DayOfWeekUtility day;

    @BeforeMethod
    public void precondition() {
        day = new DayOfWeekUtility();
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(1), "Monday");
    }

    @Test
    public void testGetDayOfWeekElse() {
        assertEquals(DayOfWeekUtility.getDayOfWeek(9), "Invalid day number. Please provide a number between 1 and 7.");
    }

    @Test
    public void testGetDayOfWeekNextYearNotLeap() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals(method.invoke(day, 0), "Monday");
    }

    @Test
    public void testGetDayOfWeekNextYearLeapWorkingDay() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals(method.invoke(day, 3), "Friday is working day of Leap Year :(");
    }

    @Test
    public void testGetDayOfWeekNextYearLeapWeekend() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals(method.invoke(day, 15), "Saturday is Weekend of Leap Year!");
    }
}
