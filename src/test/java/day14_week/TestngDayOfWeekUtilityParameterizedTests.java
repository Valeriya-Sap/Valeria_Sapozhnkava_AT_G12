package day14_week;

import homework.day14_week.DayOfWeekUtility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class TestngDayOfWeekUtilityParameterizedTests {

    private DayOfWeekUtility day;

    @BeforeMethod
    public void precondition() {
        day = new DayOfWeekUtility();
    }

    @DataProvider(name = "dayOfWeek")
    public Object[][] dayOfWeek() {
        return new Object[][]{
                {1, "Monday"},
                {2, "Tuesday"},
                {3, "Wednesday"},
                {4, "Thursday"},
                {5, "Friday"},
                {6, "Saturday"},
                {7, "Sunday"},
                {8, "Invalid day number. Please provide a number between 1 and 7."}
        };
    }


    @Test(dataProvider = "dayOfWeek")
    public void testGetDayOfWeek(int input, String expected) {
        assertEquals(DayOfWeekUtility.getDayOfWeek(input), expected);
    }

    @DataProvider(name = "dayOfYear")
    public Object[][] dayOfYear() {
        return new Object[][]{
                {0, "Monday"},
                {3, "Friday is working day of Leap Year :("},
                {15, "Saturday is Weekend of Leap Year!"}
        };
    }

    @Test(dataProvider = "dayOfYear")
    public void testGetDayOfWeekNextYear(int input, String expected) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals(method.invoke(null, input), expected);
    }

}
