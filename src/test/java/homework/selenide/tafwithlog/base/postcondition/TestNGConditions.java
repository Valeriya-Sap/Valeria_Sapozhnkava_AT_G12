package homework.selenide.tafwithlog.base.postcondition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(TestNGConditions.class);
    @BeforeMethod
    public void preCondition() {
        LOGGER.info("Test started");
    }

    @AfterMethod
    public void postCondition() {
        closeWebDriver();
        LOGGER.info("Test finished");
    }
}
