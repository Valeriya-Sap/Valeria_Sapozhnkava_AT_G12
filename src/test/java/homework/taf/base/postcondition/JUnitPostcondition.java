package homework.taf.base.postcondition;

import homework.taf.driver.Driver;
import org.junit.After;

public class JUnitPostcondition {
    @After
    public void postCondition() {
        Driver.resetDriver();
    }
}
