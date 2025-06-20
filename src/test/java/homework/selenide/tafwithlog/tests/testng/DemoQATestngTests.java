package homework.selenide.tafwithlog.tests.testng;

import homework.selenide.tafwithlog.base.postcondition.TestNGConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import homework.selenide.tafwithlog.pages.demoqa.DemoQAPage;

public class DemoQATestngTests extends TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(DemoQATestngTests.class);
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
