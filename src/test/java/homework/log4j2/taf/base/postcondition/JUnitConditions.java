package homework.log4j2.taf.base.postcondition;

import homework.log4j2.taf.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;

public class JUnitConditions {
    private static final Logger LOGGER = LogManager.getLogger(JUnitConditions.class);
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
