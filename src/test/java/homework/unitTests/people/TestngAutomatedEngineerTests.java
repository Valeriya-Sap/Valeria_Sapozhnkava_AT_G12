package homework.unitTests.people;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestngAutomatedEngineerTests {

    private AutomatedEngineer man;

    @BeforeMethod
    public void precondition() {
        man = new AutomatedEngineer(32, 7);
    }

    @Test
    public void testGetAge() {
        assertEquals(man.getAge(), 32);
    }

    @Test
    public void testSetAge() {
        man.setAge(31);
        assertEquals(man.getAge(), 31);
    }

    @Test
    public void testGetExperience() {
        assertEquals(man.getExperience(), 7);
    }

    @Test
    public void testSetExperience() {
        man.setExperience(10);
        assertEquals(man.getExperience(), 10);
    }

    @Test
    public void testGetSkill() {
        assertEquals(man.getSkill(), 21);
    }

    @Test
    public void testSetSkill() {
        man.setSkill(10);
        assertEquals(man.getSkill(), 10);
    }
}
