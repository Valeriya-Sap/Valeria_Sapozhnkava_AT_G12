package day14_week;

import homework.day14_week.DayOfWeekUtility;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class JunitDayOfWeekUtilityParameterizedTests {
    private int input;
    private String expected;

    public JunitDayOfWeekUtilityParameterizedTests(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dayValue() {
        return Arrays.asList(new Object[][]{
                {1, "Monday"},
                {2, "Tuesday"},
                {3, "Wednesday"},
                {4, "Thursday"},
                {5, "Friday"},
                {6, "Saturday"},
                {7, "Sunday"},
                {8, "Invalid day number. Please provide a number between 1 and 7."}
        });
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals(expected, DayOfWeekUtility.getDayOfWeek(input));
    }

}


