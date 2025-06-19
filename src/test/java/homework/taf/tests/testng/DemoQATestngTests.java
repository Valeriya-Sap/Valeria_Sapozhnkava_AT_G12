package homework.taf.tests.testng;

import org.testng.annotations.Test;
import homework.taf.pages.demoqa.VoidPODemoQAPage;

public class DemoQATestngTests {
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
