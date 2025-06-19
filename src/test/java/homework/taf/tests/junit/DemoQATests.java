package homework.taf.tests.junit;

import homework.taf.base.postcondition.JUnitPostcondition;
import org.junit.Test;
import homework.taf.pages.demoqa.DemoQAPage;

public class DemoQATests extends JUnitPostcondition {
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
