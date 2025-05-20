package homework.unitTests.people;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestngManualEngineerTests {

    private ManualEngineer man;

    @BeforeMethod
    public void precondition() {
        man = new ManualEngineer(28, 6);
    }

    @Test
    public void testGetAge() {
        assertEquals(man.getAge(), 28);
    }

    @Test
    public void testSetAge() {
        man.setAge(31);
        assertEquals(man.getAge(), 31);
    }

    @Test
    public void testGetExperience() {
        assertEquals(man.getExperience(), 6);
    }

    @Test
    public void testSetExperience() {
        man.setExperience(10);
        assertEquals(man.getExperience(), 10);
    }

    @Test
    public void testGetSkill() {
        assertEquals(man.getSkill(), 12);
    }

    @Test
    public void testSetSkill() {
        man.setSkill(10);
        assertEquals(man.getSkill(), 10);
    }
}
