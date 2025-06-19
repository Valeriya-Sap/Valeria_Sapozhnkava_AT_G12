package homework.taf.tests.junit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import homework.taf.pages.w3school.VoidPOGoogleSearchPage;
import homework.taf.pages.w3school.VoidPOW3SchoolPage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class W3SchoolTests {
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
