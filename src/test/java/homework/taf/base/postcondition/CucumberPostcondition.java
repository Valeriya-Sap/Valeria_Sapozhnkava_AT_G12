package homework.taf.base.postcondition;

import homework.taf.driver.Driver;
import io.cucumber.java.After;

public class CucumberPostcondition {
    @After
    public void postCondition() {
        Driver.resetDriver();
    }
}
