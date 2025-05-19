package homework.unitTests.people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitAutomatedEngineerTests {

    private AutomatedEngineer man;

    @Before
    public void precondition() {
        man = new AutomatedEngineer(25, 2);
    }

    @Test
    public void testGetAge() {
        assertEquals(25, man.getAge());
    }

    @Test
    public void testSetAge() {
        man.setAge(35);
        assertEquals(35, man.getAge());
    }

    @Test
    public void testGetExperience() {
        assertEquals(2, man.getExperience());
    }

    @Test
    public void testSetExperience() {
        man.setExperience(5);
        assertEquals(5, man.getExperience());
    }

    @Test
    public void testGetSkill() {
        assertEquals(6, man.getSkill());
    }

    @Test
    public void testSetSkill() {
        man.setSkill(5);
        assertEquals(5, man.getSkill());
    }
}
