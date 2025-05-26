package day14_week;

import homework.day14_week.DayOfWeekUtility;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class JunitDayOfWeekUtilityTests {

    private DayOfWeekUtility day;

    @Before
    public void precondition() {
        day = new DayOfWeekUtility();
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals("Monday", DayOfWeekUtility.getDayOfWeek(1));
    }

    @Test
    public void testGetDayOfWeekElse() {
        assertEquals("Invalid day number. Please provide a number between 1 and 7.", DayOfWeekUtility.getDayOfWeek(8));
    }

    @Test
    public void testGetDayOfWeekNextYearNotLeap() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals("Monday", method.invoke(day, 0));
    }

    @Test
    public void testGetDayOfWeekNextYearLeapWorkingDay() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals("Friday is working day of Leap Year :(", method.invoke(day, 3));
    }

    @Test
    public void testGetDayOfWeekNextYearLeapWeekend() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals("Saturday is Weekend of Leap Year!", method.invoke(day, 15));
    }


}
