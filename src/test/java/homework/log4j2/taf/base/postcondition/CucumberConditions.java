package homework.log4j2.taf.base.postcondition;

import homework.log4j2.taf.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CucumberConditions {
    private static final Logger LOGGER = LogManager.getLogger(CucumberConditions.class);
    @Before
    public void preCondition() {
        LOGGER.info("Test started");
    }
    @After
    public void postCondition() {
        Driver.resetDriver();
        LOGGER.info("Test finished");
    }
}
