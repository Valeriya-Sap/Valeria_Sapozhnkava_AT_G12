package homework.taf.tests.testng;

import homework.taf.base.postcondition.TestNGPostcondition;
import org.testng.annotations.Test;
import homework.taf.pages.demoqa.DemoQAPage;

public class DemoQATestngTests extends TestNGPostcondition {
    @Test
    public void testDemoQA() {
        DemoQAPage mainPage = new DemoQAPage();
        mainPage.openDemoQA();
        mainPage.selectOption();
        mainPage.selectTitle();
        mainPage.selectMenu();
        mainPage.selectMultiselect();
        mainPage.selectStandardMultiselect();

    }
}
