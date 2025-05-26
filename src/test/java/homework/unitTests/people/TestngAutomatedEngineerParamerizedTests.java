package homework.unitTests.people;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestngAutomatedEngineerParamerizedTests {

    private AutomatedEngineer man;

    @BeforeMethod
    public void precondition() {
        man = new AutomatedEngineer(32, 7);
    }

    @DataProvider(name = "value")
    public Object[][] value() {
        return new Object[][]{
                {1, 1},
                {18, 18},
                {40, 40}
        };
    }

    @Test (dataProvider = "value")
    public void testSetAge(int input, int expected) {
        man.setAge(input);
        assertEquals(man.getAge(), expected);
    }

    @Test (dataProvider = "value")
    public void testSetExperience(int input, int expected) {
        man.setExperience(input);
        assertEquals(man.getExperience(), expected);
    }

    @Test (dataProvider = "value")
    public void testSetSkill(int input, int expected) {
        man.setSkill(input);
        assertEquals(man.getSkill(), expected);
    }
}
