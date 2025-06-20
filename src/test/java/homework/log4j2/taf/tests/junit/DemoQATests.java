package homework.log4j2.taf.tests.junit;

import homework.log4j2.taf.base.postcondition.JUnitConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import homework.log4j2.taf.pages.demoqa.DemoQAPage;

public class DemoQATests extends JUnitConditions {
    private static final Logger LOGGER = LogManager.getLogger(DemoQATests.class);
    @Test
    public void testDemoQA() {
        DemoQAPage mainPage = new DemoQAPage();
        mainPage.openDemoQA();
        mainPage.selectOption();
        mainPage.selectTitle();
        mainPage.selectMenu();
        mainPage.selectMultiselect();
        mainPage.selectStandardMultiselect();
        LOGGER.debug("Test passed");
    }
}
