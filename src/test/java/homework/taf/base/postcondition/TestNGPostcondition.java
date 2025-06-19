package homework.taf.base.postcondition;

import homework.taf.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestNGPostcondition {
    @AfterMethod
    public void postCondition() {
        Driver.resetDriver();
    }
}
