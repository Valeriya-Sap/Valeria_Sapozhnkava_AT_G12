package homework.unitTests.people;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class JunitManualEngineerParametrizedTests {

    private ManualEngineer man;
    private int input;
    private int expected;

    public JunitManualEngineerParametrizedTests(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void precondition() {
        man = new ManualEngineer(25, 2);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> ageValue() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {18, 18},
                {40, 40}
        });
    }

    @Test
    public void testSetAge() {
        man.setAge(input);
        assertEquals(expected, man.getAge());
    }

    @Test
    public void testSetExperience() {
        man.setExperience(input);
        assertEquals(expected, man.getExperience());
    }

    @Test
    public void testSetSkill() {
        man.setSkill(input);
        assertEquals(expected, man.getSkill());
    }
}
