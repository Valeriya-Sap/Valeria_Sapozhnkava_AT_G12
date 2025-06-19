package homework.taf.tests.testng;

import homework.taf.base.postcondition.TestNGPostcondition;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import homework.taf.pages.w3school.GoogleSearchPage;
import homework.taf.pages.w3school.W3SchoolPage;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class W3SchoolTestngTests extends TestNGPostcondition {
    @Test
    public void testW3School() {
        W3SchoolPage mainPage = new W3SchoolPage();
        mainPage.openW3SchoolPage();
        mainPage.acceptCookies();
        mainPage.copyTitle();

        GoogleSearchPage searchPage = new GoogleSearchPage();
        searchPage.openGoogleSearch();
        searchPage.acceptCookies();
        searchPage.search();
        List<WebElement> actualTitles = searchPage.takeAllTitles();
        String expectedTitle = "tutorial";
        for (WebElement title : actualTitles) {
            String actualText = title.getText().toLowerCase();
            assertTrue(actualText.contains(expectedTitle));
        }
    }
}
