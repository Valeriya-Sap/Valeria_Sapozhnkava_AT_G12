package homework.log4j2.taf.base.postcondition;

import homework.log4j2.taf.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(TestNGConditions.class);
    @BeforeMethod
    public void preCondition() {
        LOGGER.info("Test started");
    }

    @AfterMethod
    public void postCondition() {
        Driver.resetDriver();
        LOGGER.info("Test finished");
    }
}
