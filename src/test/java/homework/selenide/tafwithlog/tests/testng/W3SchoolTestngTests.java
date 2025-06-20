package homework.selenide.tafwithlog.tests.testng;

import com.codeborne.selenide.SelenideElement;
import homework.selenide.tafwithlog.base.postcondition.TestNGConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import homework.selenide.tafwithlog.pages.w3school.GoogleSearchPage;
import homework.selenide.tafwithlog.pages.w3school.W3SchoolPage;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class W3SchoolTestngTests extends TestNGConditions {
    private static final Logger LOGGER = LogManager.getLogger(W3SchoolTestngTests.class);

    @Test
    public void testW3School() {
        W3SchoolPage mainPage = new W3SchoolPage();
        GoogleSearchPage searchPage = new GoogleSearchPage();
        mainPage.openW3SchoolPage();
        mainPage.acceptCookies();
        mainPage.copyTitle();
        searchPage.openGoogleSearch();
        searchPage.acceptCookies();
        searchPage.search();
        List<SelenideElement> actualTitles = searchPage.takeAllTitles();
        String expectedTitle = "tutorial";
        for (WebElement title : actualTitles) {
            String actualText = title.getText().toLowerCase();
            assertTrue(actualText.contains(expectedTitle));
            LOGGER.debug("Test passed");
        }
    }
}
