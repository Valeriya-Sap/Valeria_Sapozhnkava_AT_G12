package day14_week;

import homework.day14_week.DayOfWeekUtility;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class JunitDayOfWeekUtilityParameterizedSecondTests {
    private int input;
    private String expected;

    public JunitDayOfWeekUtilityParameterizedSecondTests(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dayValue() {
        return Arrays.asList(new Object[][]{
                {0, "Monday"},
                {3, "Friday is working day of Leap Year :("},
                {15, "Saturday is Weekend of Leap Year!"}
        });
    }

    @Test
    public void testGetDayOfWeekNextYearNotLeap() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = DayOfWeekUtility.class.getDeclaredMethod("getDayOfWeekNextYear", int.class);
        method.setAccessible(true);
        assertEquals(expected, method.invoke(null, input));
    }

}


