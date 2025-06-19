package homework.taf.tests.junit;

import org.junit.Test;
import homework.taf.pages.demoqa.VoidPODemoQAPage;

public class DemoQATests {
    @Test
    public void testDemoQA() {
        VoidPODemoQAPage mainPage = new VoidPODemoQAPage();
        mainPage.openDemoQA();
        mainPage.selectOption();
        mainPage.selectTitle();
        mainPage.selectMenu();
        mainPage.selectMultiselect();
        mainPage.selectStandardMultiselect();

    }
}
