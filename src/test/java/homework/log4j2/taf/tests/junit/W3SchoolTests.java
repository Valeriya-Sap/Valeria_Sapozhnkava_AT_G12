package homework.log4j2.taf.tests.junit;

import homework.log4j2.taf.base.postcondition.JUnitConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import homework.log4j2.taf.pages.w3school.GoogleSearchPage;
import homework.log4j2.taf.pages.w3school.W3SchoolPage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class W3SchoolTests extends JUnitConditions {
    private static final Logger LOGGER = LogManager.getLogger(W3SchoolTests.class);

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
        List<WebElement> actualTitles = searchPage.takeAllTitles();
        String expectedTitle = "tutorial";
        for (WebElement title : actualTitles) {
            String actualText = title.getText().toLowerCase();
            assertTrue(actualText.contains(expectedTitle));
            LOGGER.debug("Test passed");
        }
    }
}
