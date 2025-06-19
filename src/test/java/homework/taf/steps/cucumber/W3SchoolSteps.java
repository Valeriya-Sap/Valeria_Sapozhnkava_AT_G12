package homework.taf.steps.cucumber;

import homework.taf.pages.w3school.GoogleSearchPage;
import homework.taf.pages.w3school.W3SchoolPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class W3SchoolSteps {
    W3SchoolPage mainPage = new W3SchoolPage();
    GoogleSearchPage searchPage = new GoogleSearchPage();
    List<WebElement> actualTitles = searchPage.takeAllTitles();

    @Given("I open a site w3school")
    public void openSite() {
        mainPage.openW3SchoolPage();
        mainPage.acceptCookies();
        mainPage.copyTitle();
    }

    @When("I search tutorial")
    public void fillSelectors() {
        searchPage.openGoogleSearch();
        searchPage.acceptCookies();
        searchPage.search();
    }

    @Then("I verify headers")
    public void checkHeaders() {
        String expectedTitle = "tutorial";
        for (WebElement title : actualTitles) {
            String actualText = title.getText().toLowerCase();
            assertTrue(actualText.contains(expectedTitle));
        }
    }
}
