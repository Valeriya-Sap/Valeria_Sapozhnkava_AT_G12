package taf.tests.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import taf.pages.w3school.VoidPOGoogleSearchPage;
import taf.pages.w3school.VoidPOW3SchoolPage;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class W3SchoolTestngTests {
    @Test
    public void testW3School() {
        VoidPOW3SchoolPage mainPage = new VoidPOW3SchoolPage();
        mainPage.openW3SchoolPage();
        mainPage.acceptCookies();
        mainPage.copyTitle();

        VoidPOGoogleSearchPage searchPage = new VoidPOGoogleSearchPage();
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
